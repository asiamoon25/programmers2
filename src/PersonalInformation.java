import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PersonalInformation {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        Map<String, Integer> map = new HashMap<>();
        for(String term : terms){
           String person = term.split(" ")[0];
           int month = Integer.parseInt(term.split(" ")[1]);
           map.put(person, month);
        }

        Map<String, String> map2 = new HashMap<>();
        for(int i = 0; i < privacies.length; i++) {
            String date = privacies[i].split(" ")[0];
            String person = privacies[i].split(" ")[1];
            map2.put(person, date);
        }

        for(int i = 0; i < privacies.length; i++){
            String person = privacies[i].split(" ")[1];
            int month = 0;
            if(map.containsKey(person)){
                month = map.get(person);
            }

            int privacyMonth = Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[1]);

        }
        return answer;
    }
    public static void main(String[] args) {
        String today ="2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        solution(today, terms, privacies);
    }
}
