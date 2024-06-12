import java.util.*;

public class TruckOnBridge {
    public static int solution(int bridge_length, int weight, int[] truck_weight) {
        int answer = 0;
        // 다리에 올라와 있는 차의 무게 -> Queue
        Deque<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>(); // 지나가고 있는 트럭

        for(int i = 0; i < truck_weight.length; i++){
            q.add(truck_weight[i]);
        }

        int time = 0;

        

        return answer;
    }

    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        solution(bridge_length,weight,truck_weights);
    }
}
