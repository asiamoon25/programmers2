package sail_phase2;
import java.util.*;

public class Boat {
    /*
        보트에는 2명 씩 밖에 못탐.
     */
    public static int solution (int[] people, int limit){
        int answer = 0;

        Arrays.sort(people);

        int count = 1;


        for(int i = 0; i < people.length; i++){

        }
        answer = count;

        return answer;
    }

    public static void main(String[] args) {
        int[] people = {70,50,80,50};
        int limit = 100;

        solution(people, limit); // 3
    }
}
