import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PersonalInformation {
    public static int[] solution(String today, String[] terms, String[] privacies) {

        /*
        Map 에 사람, 유효기간 으로 담음.
         */
        Map<String, Integer> map = new HashMap<>();
        for(String term: terms){
            String person = term.split(" ")[0];
            int day = Integer.parseInt(term.split(" ")[1]);
            map.put(person, day);
        }



        int[] answer = {};
        return answer;
    }
    public static void main(String[] args) {
        String today ="2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        solution(today, terms, privacies);
    }
}
