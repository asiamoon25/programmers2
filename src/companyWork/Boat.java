package companyWork;

import java.util.*;

public class Boat {
    public static int solution (int[] people, int limit){
        int answer = 0;

        Arrays.sort(people);

        int totalWeight = 0;
        int count = 1;
        // 낮은 몸무게 순으로 정렬한 다음에 하나 씩 더 한 다음에 limit 이상일 시 count + 1

        return answer;
    }

    public static void main(String[] args) {
        int[] people = {70,50,80,50};
        int limit = 100;

        solution(people, limit); // 3
    }
}
