import java.util.*;
class MoreHot {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        int mixScoville = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++){
            q.add(scoville[i]);
        }
        int count = 0;
        boolean isTrue = true;
        // int[] scoville = {1,2,3,9,10,12};
        while(isTrue) {
            // 처음 들어온 리스트 음식들 스코빌 K 이상인지..
            int food = q.peek();
            if(food >= K) {
                break;
            }
            if(q.isEmpty()){
                count = -1;
                break;
            }

            if(q.size() < 2 && food < K){
                count = -1;
                break;
            }

            int min = q.poll();
            int min2 = q.poll();

            mixScoville = min + (min2 *2);

            q.add(mixScoville);

            count++;

            if (q.peek() >= K) {
                isTrue = false;
            }
        }
        answer = count;
        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(solution(scoville,7));
    }
}