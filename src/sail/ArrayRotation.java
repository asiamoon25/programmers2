package sail;

import java.util.*;

public class ArrayRotation {
    public static int[] solution(int rows, int columns, int[][] queries) {
        int[][] arr = new int[rows][columns];
        int a = 1;
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = a;
                a++;
            }
        }// 배열 초기화 완료
        int[] result = new int[queries.length];
        // 테두리 값만 추출 시계 방향 순서로...
        for(int i = 0; i < queries.length; i++){
            int x = queries[i][0] -1;
            int y = queries[i][1] -1;
            int x2 = queries[i][2] -1;
            int y2 = queries[i][3] -1;

            Deque<Integer> q = new LinkedList<>();
            for(int j = y; j <= y2; j++){
                q.add(arr[x][j]);
            }
            q.pollLast();
            for(int k = x; k<= x2; k++) {
                q.add(arr[k][y2]);
            }
            q.pollLast();
            for(int l = y2; l >= y; l--){
                q.add(arr[x2][l]);
            }
            q.pollLast();
            for(int m = x2; m >= x; m--){
                q.add(arr[m][y]);
            }
            q.pollLast();

            int switchNum = q.pollLast();
            q.addFirst(switchNum);

            int min = Collections.min(q);


            for(int j = y; j <= y2; j++){
                arr[x][j] = q.poll();
                if(j == y2){
                    q.addFirst(arr[x][j]);
                }
            }


            for(int k = x; k<= x2; k++) {
                arr[k][y2] = q.poll();
                if(k == x2){
                    q.addFirst(arr[k][y2]);
                }
            }

            for(int l = y2; l >= y; l--){

                arr[x2][l] = q.poll();
                if(l == y) {
                    q.addFirst(arr[x2][l]);
                }
            }

            for(int m = x2; m >= x; m--){
                if(m == x){
                    q.addFirst(arr[m][y]);
                }
                arr[m][y] = q.poll();
            }
            result[i] = min;
        }


        int[] answer = result;
        return answer;
    }

    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] queries = {{2,2,5,4}, {3,3,6,6},{5,1,6,3}};
        solution(rows, columns, queries);
    }
}
