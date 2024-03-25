import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WallPaper {
    public static int[] solution(String[] wallpaper) {

        char[][] arr = new char[wallpaper.length][wallpaper[0].length()];
        List<Integer[]> list = new ArrayList<>(); // h list

        for(int i = 0; i < wallpaper.length; i ++){
            arr[i] = wallpaper[i].toCharArray();
        }
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[0].length(); j ++ ){
                if(arr[i][j] == '#') {
                    Integer[] arr2 = new Integer[2];
                    arr2[0] = i;
                    arr2[1] = j;
                    list.add(arr2);
                }
            }
        }

        int maxW = 0;
        int maxH = 0;
        int minW = wallpaper[0].length() -1;
        int minH = wallpaper.length -1;
        for(int i = 0; i < list.size(); i++){
            Integer[] arr3 = list.get(i);
            if(maxH < arr3[0]) {
                maxH = arr3[0];
            }

            if(maxW < arr3[1]) {
                maxW = arr3[1];
            }
        }

        for(int i =0; i < list.size(); i++){
            Integer[] arr3 = list.get(i);
            if(minH > arr3[0]) {
                minH = arr3[0];
            }

            if(minW > arr3[1]) {
                minW = arr3[1];
            }
        }
        int[] arr4 = new int[4];
        arr4[0] = minH;
        arr4[1] = minW;
        arr4[2] = maxH+1;
        arr4[3] = maxW + 1;

        int[] answer = arr4;

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
