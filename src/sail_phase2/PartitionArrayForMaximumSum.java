package sail_phase2;

import java.util.LinkedList;
import java.util.Queue;

public class PartitionArrayForMaximumSum {

    /*
    정수 배열 배열이 주어지면, 배열을 최대 k 길이의 (인접한) 서브 배열로 분할합니다.
    분할 후 각 서브 배열의 값은 해당 서브 배열의 최대값이 되도록 변경됩니다.
    분할 후 주어진 배열의 최대 합을 반환합니다. 답이 32비트 정수에 맞도록 테스트 케이스가 생성됩니다.
     */
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length; // 배열의 길이를 n에 저장
        int[] dp = new int[n]; // 동적 프로그래밍을 위한 배열 dp 생성

        for (int i = 0; i < n; i++) { // 배열의 각 원소에 대해서 반복
            int max = arr[i]; // 현재 원소를 최댓값으로 초기화

            for (int j = 1; j <= k && i - j + 1 >= 0; j++) {
                // 최대 길이가 k인 부분 배열을 만들기 위한 반복문
                // 현재 원소로부터 역방향으로 j개의 원소를 포함한 부분 배열을 만들어봄

                max = Math.max(max, arr[i - j + 1]); // 최댓값 갱신

                // 현재 부분 배열의 최댓값을 구하고, 이를 이용하여 dp 값을 업데이트
                dp[i] = Math.max(dp[i], (i >= j ? dp[i - j] : 0) + max * j);
            }
        }

        return dp[n - 1]; // 마지막 원소까지 고려한 최댓값 반환
    }

    public static void main(String[] args) {
        int[] arr = {1,15,7,9,2,5,10};
        int k = 3;

        int answer = maxSumAfterPartitioning(arr,k); // 84

        System.out.println(answer);
    }
}
