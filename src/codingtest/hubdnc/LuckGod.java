package codingtest.hubdnc;

import java.util.*;

public class LuckGod {
    /*
        { answer : 정답 번호 (1~5), score : number }로 이루어진 배열 arr이 정답지로 넘어갈 때,
        가장 점수가 높은 수포자의 이름과 점수를 “이름 : 점수” 형태로 리턴해 주세요.

        시험 응시자는 1번으로 모두 찍은 a, 3번으로 모두 찍은 b, 5번으로 모두 찍은 c가 있습니다.
     */
    public static String solution(int[][] arr){

        Map<Integer, String> map = new HashMap<>(); // 찍은 번호 = 사람 이름

        map.put(1, "a");
        map.put(3, "b");
        map.put(5,"c");

        Map<String, Integer> map2 = new HashMap<>(); // 사람별 score
        for(int[] answerAndScore : arr){
            int answer = answerAndScore[0];
            int score = answerAndScore[1];

            if(map.containsKey(answer)) {
                String name = map.get(answer);
                map2.put(name, map2.getOrDefault(name, 0) + score);
            }
        }

        int maxScore = Collections.max(map2.values());

        StringBuilder result = new StringBuilder();

        for(Map.Entry<String, Integer> entry : map2.entrySet()) {
            if(entry.getValue() == maxScore) {
                if(result.length() > 0) result.append(", ");
                result.append(entry.getKey()).append(":").append(entry.getValue());
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        /*
        [ { answer : 1, score : 5 }, { answer : 3, score : 3 }, { answer : 2, score : 4 } ] → a : 5
        [ { answer : 1, score : 5 }, { answer : 5, score : 5 }, { answer : 2, score : 4 } ] → a : 5, c : 5
         */

        int[][] arr = {{1,5},{3,3},{2,4}};
        System.out.println(solution(arr));
    }
}
