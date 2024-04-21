import java.util.*;

public class Walk {
    public static int[] solution(String[] park, String[] routes) {
        /*
        park의 length 는 h 값
        park[0] 의 length 는 w 값
        시작 좌표를 찾아서 routes for 문으로 돌리면 된다.
        Start 좌표는 S가 있는 h, w 의 값
        Trap 좌표는 X 가 있는 곳, 여러 곳일 수도 있음.
         */
        int maxWidth = park[0].length() - 1;
        int maxHeight = park.length -1;

        int sw = 0;
        int sh = 0;
        char[][] arr = new char[park.length][park[0].length()];
        for(int i = 0; i < park.length; i++){ // 출발지점 좌표 찾기
            arr[i] = park[i].toCharArray();
            if(park[i].contains("S")) {
                sh = i;
                sw = park[i].indexOf("S");
            }
        }


        for (String route : routes) {
            int nw = sw;
            int nh = sh;
            String direction = route.split(" ")[0];
            int distance = Integer.parseInt(route.split(" ")[1]);
            int tempW = nw;
            int tempH = nh;
            for (int j = 0; j < distance; j++) {
                if ("E".equals(direction)) {
                    nw += 1;
                } else if ("W".equals(direction)) {
                    nw -= 1;
                } else if ("N".equals(direction)) {
                    nh -= 1;
                } else if ("S".equals(direction)) {
                    nh += 1;
                }

                boolean isPossible = nw <= maxWidth && nh <= maxHeight && (nw >= 0 && nh >= 0);
                if (isPossible) {
                    if (arr[nh][nw] == 'X') {
                        break;
                    }
                    if (j == distance - 1) {
                        sw = nw;
                        sh = nh;
                    }
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = sh;
        answer[1] = sw;

        return answer;
    }

    public static void main(String[] args) {
        String[] park = {"SOO","OXX","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        solution(park,routes);
    }
}
