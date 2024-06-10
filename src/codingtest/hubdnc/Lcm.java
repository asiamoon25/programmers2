package codingtest.hubdnc;

import java.util.*;

public class Lcm {
    public static int solution(int[] arr) {

        Queue<Integer> queue = new LinkedList<>();
        for(int a : arr) {
            queue.add(a);
        }

        List<Integer> answer = new ArrayList<>();

        while(!queue.isEmpty()){
            int first = queue.poll();

            for (int second : queue) {
                int gcd = getGCD(first, second);

                int lcm = first * second / gcd;

                answer.add(lcm);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).sum();
    }

    public static int getGCD(int n, int m){
        if(m == 0){
            return n;
        }else{
            return getGCD(m , n%m);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(solution(arr));
    }
}
