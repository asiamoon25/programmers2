import java.util.ArrayList;
import java.util.List;

public class CreatedKeyBoard {

    public static int[] solution(String[] keymap, String[] targets) {

        // targets 에 있는 문자열을 차례대로 돌려서 keymap 에 있는 애들 중에 인덱스가 가장 작은 애들을 고르기
        // keymap 의 각 원소들을 선택할때마다 count ++
        char[][] arr = new char[targets.length][targets[0].length()];



        int[] answer = {};
        return answer;
    }
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};

        solution(keymap, targets);
    }
}
