import java.util.HashMap;
import java.util.Map;

public class LevelZero {
    public static int solution(String[] friends, String[] gifts) {

//        int sendCount = 0;
//        int gavenCount = 0;


        // 선물 지수 대결
        // 선물 지수는 준 선물 - 받은 선물

//        Map<String, Integer> sendFriend = new HashMap<>();
//        Map<String, Integer> receiveFriend = new HashMap<>();
//        for(String friend : friends){
//            sendFriend.put(friend, 0);
//            receiveFriend.put(friend,0);
//        }
//
//        for(int i = 0; i < gifts.length; i++) {
//            String sender = gifts[i].split(" ")[0]; // 선물을 준 사람
//            String receiver = gifts[i].split(" ")[1]; // 선물을 받은 사람
//
//            if(sendFriend.containsKey(sender)){
//                sendFriend.put(sender,sendFriend.get(sender) + 1);
//            }
//
//            if(receiveFriend.containsKey(receiver)) {
//                receiveFriend.put(receiver, receiveFriend.get(sender) + 1);
//            }
//        }

        Map<String, Integer> jisu = new HashMap<>();
        for(int i =0; i < friends.length; i++){
            String name = friends[i];
            int presentJisu = 0;
            int sendCount = 0;
            int receiveCount = 0;
            jisu.put(name, 0);
            for(int j = 0; j < gifts.length; j++){

                String sender = gifts[j].split(" ")[0];
                String receiver = gifts[j].split(" ")[1];
                if(name.equals(sender)) {
                    sendCount++;
                }
                if(name.equals(receiver)){
                    receiveCount++;
                }

            }
            presentJisu = sendCount - receiveCount;
            jisu.put(name,presentJisu);
        }

        int maxNum = 0;
        for(int i =0; i<friends.length; i++){
            int jisuValue = jisu.get(friends[i]);
            if(maxNum < jisuValue){
                maxNum = jisuValue;
            }
            System.out.println(maxNum);
        }


        return maxNum;
    }

    public static void main(String[] args) {
        String[] friends = 	{"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        solution(friends, gifts);
    }
}
