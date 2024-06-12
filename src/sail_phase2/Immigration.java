package sail_phase2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Immigration {
    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/43238
     */
    public static long solution(int n, int[] times) {
        /*
        n 은 입국심사를 기다리는 사람
        times 는 각 심사관들의 심사하는데 걸리는 시간

        최소값만 골라 가는 것, 큐에 넣어 놨다가 7에 아직 있으면 10으로 가는 방법
         */
        long answer = 0;
        /*
        1 -> 7
        2 -> 10  --> 3
        3 -> 7 --> 4
        4 -> 10 --> 6
        5 -> 7 --> 1
        6 -> 7


        시간은 계속 흐르는 상태에서
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28
        1 ->              끝
        2 ->                       끝
                         3->                       끝
                                   4->                                     끝
                                                   5->                         끝
                                                                               6 ->                         끝
         */
        // for문으로 시간 구현?
        // 이분 탐색
        /*

         */

        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] times = {7,10};

        System.out.println(solution(n,times));
    }
}
