import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        /*
        배열 합치기
        각 배열의 원소들은 1번만 사용할 수 있음.
        그러면 goal 을 돌리면서 card1, card2 덱을 한번 씩 사용해서
         */
        String answer ="Yes";
        List<String> list1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> list2 = new ArrayList<>(Arrays.asList(cards2));
        for(int i = 0; i < goal.length; i++){
            if(list1.size() != 0 && goal[i].equals(list1.get(0))) {
                list1.remove(0);
            }else if(list2.size() != 0 && goal[i].equals(list2.get(0))) {
                list2.remove(0);
            }else{
                answer = "No";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] card1 = {"i", "drink", "water"};
        String[] card2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        solution(card1,card2, goal);
    }
}
