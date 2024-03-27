public class Deck {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        /*
        배열 합치기
        각 배열의 원소들은 1번만 사용할 수 있음.
        그러면 goal 을 돌리면서 card1, card2 덱을 한번 씩 사용해서
         */
        for(int i = 0; i < goal.length; i++){
            for(int j = 0; j < cards1.length; j++){

            }

            for(int j =0; j < cards2.length; j++){

            }
        }
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        String[] card1 = {"i", "drink", "water"};
        String[] card2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        solution(card1,card2, goal);
    }
}
