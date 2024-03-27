import java.util.*;

public class CreatedKeyBoard {

    public static int[] solution(String[] keymap, String[] targets) {

        /*
        keymap 의 원소 자기 자신에서 중복된 원소들을 넣으면됨. 하지만 중복되는 char 의 경우에는 가장 먼저 입력한 index만 넣으면 됨.
        하지만 {A=1, B=2, C=4, D=5, E=3, F=4} 이렇게 나옴.. B 는 2번 키 1번만 누르면 되는건데...
        */
        Map<Character, Integer> map = new HashMap<>(); // map 에 각 keymap 의 알파벳들의 최솟값이 찍힘.
        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){
                char arr = keymap[i].charAt(j);
                if(map.containsKey(arr)) {
                    int idx = map.get(arr);
                    map.put(arr, Math.min(idx, j+1));
                }else{
                    map.put(arr, j+1);
                }

            }
        }
        int[] result = new int[targets.length];
        for(int i = 0; i < targets.length; i++){
            String target = targets[i];
            int count = 0;
            boolean flag = true;
            for(char c : target.toCharArray()){
                if(map.containsKey(c)){
                    count += map.get(c);
                }else{
                    flag = false;
                    break;
                }
            }
            result[i] = flag ? count : -1;
        }
        System.out.println(Arrays.toString(result));
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
