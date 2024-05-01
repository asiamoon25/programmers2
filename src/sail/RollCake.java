package sail;


import java.util.*;
import java.util.stream.Collectors;

public class RollCake {

    public static int solution(int[] topping) {
        int answer = -1;


        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();

        for(int i = 0; i < topping.length; i++){
            map.put(topping[i],map.getOrDefault(topping[i],0));
        }

        for(int i = 0; i < map.size(); i++){
            map2.put(topping[i], map2.getOrDefault(map2.get(topping[i]),0));

        }

        return answer;
    }

    public static void main(String[] args) {
        int[] topping = {1,2,1,3,1,4,1,2};
        solution(topping);
    }
}
