package codingtest.hubdnc;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static int solution(int a) {

        // 2 부터 구하고자 하는 구간의 모든 수 나열
        List<Boolean> list = new ArrayList<>();
        list.add(false);
        list.add(false);
        for(int i = 2; i <= a; i++){
            list.add(i, true);
        }



        // 2,3,4,5
        for(int i = 2; i <= Math.sqrt(a); i++){ // 원하는 숫자의 제곱근 까지 구하면 그 이상으로는 구하지 않아도 됨. 절반만 검사
            if (list.get(i)){
                for(int j = i*i; j <= a; j+=i){ // 4 ~ 5
                    list.set(j, false);
                }
            }
        }

        List<Integer> primeNumber = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i)) {
                primeNumber.add(i);
            }
        }

        return primeNumber.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        /*
        양의 정수인 a값이 주어질 때 1부터 a값 이하에 존재하는 모든 소수의 합을 리턴하는 solution 함수를 작성해주세요.
        a : 5 → 10    2,3,5 => 10
        a : 10 → 17
        a : 30 → 129
         */
        int a = 5;
        System.out.println(solution(a));
    }
}
