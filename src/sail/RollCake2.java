package sail;

import java.util.*;

public class RollCake2 {
    public static int solution(int[] topping) {
        int answer = 0;

        HashMap<Integer,Integer> chulsu = new HashMap<>();
        HashMap<Integer,Integer> yeonghee = new HashMap<>();

        for(int i = 0; i < topping.length; i++){
            chulsu.put(topping[i], chulsu.getOrDefault(topping[i], 0) + 1);
        }
        int result = 0;
        for(int i = 0; i < topping.length; i++){ // 영희에게 put 한 후에 철수에서 해당 값 -1 0이면 철수에서 remove
            yeonghee.put(topping[i], yeonghee.getOrDefault(topping[i],0) + 1);
            if(chulsu.containsKey(topping[i])) {
                if(chulsu.get(topping[i]) - 1 <=0){
                    chulsu.remove(topping[i]);
                }else{
                    chulsu.put(topping[i], chulsu.getOrDefault(topping[i],0) -1);
                }
            }

            if(chulsu.size() == yeonghee.size()) {
                result++;
            }
        }
        answer = result;

        return answer;
    }

    public static void main(String[] args) {
        int[] topping = {1,2,1,3,1,4,1,2};
        solution(topping);
    }
}
