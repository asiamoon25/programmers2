package sail;

import java.util.*;

public class HIndex {
    /*

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++){
            int h = citations.length - i; // 인용된 논문의 수

            if(citations[i] >= h) {
                answer =h;
                break;
            }
        }
 */
    /*
        1. 연구자가 출판한 논문들을 인용 횟수에 따라 내림차순으로 정렬
        2. 이 리스트에서, 논문의 인용 횟수가 그 논문의 리스트상의 순서(또는 번호) 이상인 최대의 숫자를 찾음
        3. 이 숫자가 연구자의 h index 가 됨.

        이런 개 같은 문제가
        citations 의 index 는 n 편인거임...
        0번 째 인덱스는 0 + 1 1편의 논문인거임... ㅅㅂ..
     */
    public static int solution(int[] citations) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> o2-o1);
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < citations.length; i++){
            q.add(citations[i]);
        }


        for(int i = 0; i < q.size(); i++) {
            if(!q.isEmpty()){
                int a = q.poll(); // 6

                stack.push(a); // 6
                System.out.println(stack);
                if(stack.size() >= a && q.size() <= a){
                    System.out.println(a);
                    answer = a;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5}; // 65310
        solution(citations);
    }

}

/*

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++){
            int h = citations.length - i; // 인용된 논문의 수

            if(citations[i] >= h) {
                answer =h;
                break;
            }
        }
 */
