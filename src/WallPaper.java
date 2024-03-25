import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WallPaper {
    public static int[] solution(String[] wallpaper) {

        char[][] arr = new char[wallpaper.length][wallpaper[0].length()];
        List<Integer> list = new ArrayList<>(); // h list
        List<Integer> list2 = new ArrayList<>(); // w list
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[0].length(); j ++ ){
                if(arr[i][j] == '#') {
                    list.add(i);
                    list2.add(j);
                }
            }
        }
        int maxW = 0;
        int maxH = 0;
        int minW = wallpaper[0].length();
        int minH = wallpaper.length;
        for(int i = 0; i < list.size(); i++){
            if(maxH < list.get(i)) {
                maxH = list.get(i);
            }
        }

        for(int i = 0; i < list2.size(); i ++){
            if(maxW < list2.get(i)) {
                maxW = list2.get(i);
            }
        }


        System.out.println(maxH);
        System.out.println(maxW);
        System.out.println(minH);
        System.out.println(minW);
        int[] arr4 = new int[4];
        arr4[0] = minH;
        arr4[1] = minW;
        arr4[2] = maxH+1;
        arr4[3] = maxW + 1;

        int[] answer = arr4;
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void main(String[] args) {
        // 0,1 1,2 2,3
        String[] wallpaper = {".#...", "..#..", "...#."};
        // 드래그 시작점, 드래그 끝점
        //[0, 1, 3, 4]
        solution(wallpaper);
    }
}
