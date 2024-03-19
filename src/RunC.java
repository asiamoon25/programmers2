import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RunC {
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};

//        for(int i = 0; i < callings.length; i++){
//            for(int j = 0; j < players.length; j++){
//                if(callings[i].equals(players[j])){
//                    String temp = new String(players[j-1]);
//                    players[j-1] = players[j];
//                    players[j] = temp;
//                }
//            }
//        }
//        answer = players;
        Map<String,Integer> map = new HashMap<>();
        return answer;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        solution(players,callings);
    }
}
