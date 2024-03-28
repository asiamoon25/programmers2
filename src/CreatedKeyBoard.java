import java.util.*;

public class CreatedKeyBoard {

    public static int[] solution(String[] keymap, String[] targets) {

        /*
        keymap 의 원소 자기 자신에서 중복된 원소들을 넣으면됨. 하지만 중복되는 char 의 경우에는 가장 먼저 입력한 index만 넣으면 됨.
        */
        Map<Character, Integer> map = new HashMap<>(); // map 에 각 keymap 의 알파벳들의 최솟값이 찍힘.
        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){ // keymap 에 원소들(String) 을 다시 쪼개서 char 로 만듬.
                char arr = keymap[i].charAt(j);
                if(map.containsKey(arr)) { // map 에 이미 존재하면
                    int idx = map.get(arr); // 해당 map 에 있는 index 를 조회해서
                    map.put(arr, Math.min(idx, j+1)); // min 값으로 뽑는다.
                }else{
                    map.put(arr, j+1); // 없으면 넣음.
                }
            }
        }
        int[] result = new int[targets.length]; // targets 의 길이만큼의 배열을 준비
        for(int i = 0; i < targets.length; i++){
            String target = targets[i];
            int count = 0;
            boolean flag = true;
            for(char c : target.toCharArray()){
                if(map.containsKey(c)){ // c 가 map 에 존재 시 count 에 인덱스를 더해서 넣음 -> 인덱스 + 1 은 키패드를 누른 횟수이기 때문
                    count += map.get(c);
                }else{
                    flag = false;
                    break;
                }
            }
            result[i] = flag ? count : -1; // c 가 맵에 없으면 -1 을 넣어줘야함.
        }
        int[] answer = result;
        return answer;
    }
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        // result => [9,7]
        solution(keymap, targets);
    }
}
