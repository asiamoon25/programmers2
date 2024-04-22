package sail;

import java.util.*;

public class ArrayRotation {
    public static int[] solution(int rows, int columns, int[][] queries) {
        /*
        Queue 로 회전을 일자로 묶어서 addLast 때리면 된다.
        그전에 가운데 부분을 비운 배열을 뽑아야됨.
         */


        int[][] arr = new int[rows][columns];
        int a = 1;
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = a;
                a++;
            }
        }// 배열 초기화 완료

        // 테두리 값만 추출 시계 방향 순서로...

        for(int i = 0; i < queries.length; i++){
            int x1 = queries[i][0] - 1;
            int y1 = queries[i][1] - 1;
            int x2 = queries[i][2] - 1;
            int y2 = queries[i][3] - 1;



        }

        for(int i = 0 ; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }





        int[] answer = {};
        return answer;
    }


    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] queries = {{2,2,5,4}, {3,3,6,6},{5,1,6,3}};
        solution(rows, columns, queries);
    }
}
