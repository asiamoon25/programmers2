package stackandqueue;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.*;

public class Process {
    public static int solution(int[] priorities, int location) {
        /*
        1. 실행 대기 큐(Queue) 에서 대기중인 프로세스를 하나 꺼냄.
        2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣음
        3. 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행함.
            3.1 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료됨.

        Queue 준비
        우선순위의 index, priority 세트인 int[] 을 저장
        location 을 받아섯 해당 index 의 값을 찾아야됨.
        최대값을 뽑은 후 Queue 를 최대값의 index 아래로 순서대로 조정하면 됨.
         */


        Deque<int[]> q2 = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++){
            q2.add(new int[]{i,priorities[i]});
        }
        /*
        2 1 3 2
        2 > 1 ? 2 3 2 1
        2 > 3 ? 3 2 1 2
        3 > 2 ? 3 1 2 2
        3 > 1 ? 3 2 2 1
         */

        int[] max = q2.pollFirst();

        for(int i = 0; i <= q2.size()+1; i++){
            int[] arr = q2.pollFirst();
            if(max[1] > arr[1]) {
                q2.addLast(arr);
            }else if(max[1] <= arr[1]){
                int[] temp = max;
                max = arr;
                q2.addLast(temp);
            }
        }

        q2.addFirst(max);
        int answer = 0;
        int qSize = q2.size();
        for(int i = 0; i < qSize; i++){
            int[] arr = q2.pollFirst();
            if(arr[0] == location){
                answer = i+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};
        int location = 0; // 2번째 인덱스
        solution(priorities,location);  // 1
    }
}