package stackandqueue;


import java.util.*;

/*
프로그래머스 기능개발
 */
public class FunctionDevelopement {
    public static int[] solution(int[] progresses, int[] speeds){

        Queue<Integer> timeTaken = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++){
            int progress = progresses[i];
            int speed = speeds[i];
            int count = 0;
            while(true){ // 하나의 과정이 끝나는 일 수
                count++;
                progress += speed;
                if(progress >= 100){
                    break;
                }
            }
            timeTaken.add(count);
        }


        List<Integer> list = new ArrayList<>();


        int timeTakenSize = timeTaken.size();
        for(int i = 0; i < timeTakenSize; i++) {
            Integer first = timeTaken.peek();
            int count = 0;
            for(int j = 0; j < timeTakenSize; j++){
                Integer second = timeTaken.peek();
                if(second != null){
                    if(first >= second) {
                        count ++;
                        timeTaken.poll();
                        if(timeTaken.isEmpty()){
                            break;
                        }

                    }else{
                        break;
                    }
                }
            }
            list.add(count);
        }
        list.removeIf(n -> n == 0);

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {93,30,55,25,34,55,10,70,75};
        int[] speeds = {1,30,5,6,26,30,2,40,6};
        solution(progresses,speeds); //  2,1,3,3
    }
}
