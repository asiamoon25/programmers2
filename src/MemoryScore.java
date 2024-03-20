import java.util.HashMap;
import java.util.Map;

public class MemoryScore {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {


        Map<String, Integer> mapping = new HashMap<>();

        for(int i = 0; i < name.length; i++){
            mapping.put(name[i],yearning[i]);
        }
        int[] plus = new int[photo.length];
        for(int i = 0;  i < photo.length; i++){
            String[] p = photo[i];
            int result = 0;
            for(int j = 0; j < p.length; j ++){
                if(mapping.containsKey(p[j])){
                    result += mapping.get(p[j]);
                }
            }
            plus[i] = result;
        }
//        int[] answer = new int[photo.length];

//        return answer;
        return plus;
    }

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        solution(name,yearning,photo);
    }
}


/*

 */
