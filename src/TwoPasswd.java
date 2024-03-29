import java.util.Arrays;

public class TwoPasswd {
    // 둘만의 암호
    public static String solution(String s, String skip, int index) {
        // 97 ~ 122 -> a ~ z
        char[] sChar = s.toCharArray();
        String answer = "";
        for(int k = 0; k < sChar.length; k++){
            for(int i = 0; i < index; i++){
                sChar[k] += 1;
                if(sChar[k] > 122) {
                    sChar[k] = 97;
                }
                if(skip.contains(Character.toString(sChar[k]))){
                    i--;
                }
            }
            answer += Character.toString(sChar[k]);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        solution(s,skip,index);
    }
}
