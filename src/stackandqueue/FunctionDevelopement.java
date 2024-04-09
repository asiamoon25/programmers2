package stackandqueue;

public class FunctionDevelopement {
    /*
    각 기능은 진도가 100% 일때 서비스에 반영 가능
    각 기능 개발속도는 모두 다름.
    이때 뒤에 잇는 기능은 앞에 있는 기능이 배포 될 때 함께 배포됨. -> Queue<Map<Integer,Integer>>

    먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses 와
    각 작업의 개발 속도가 적힌 정수 배열 speeds 가 주어질 때 각 배포마다 몇 개의 기능이 배포
    되는지를 return
     */
    public static int[] solution(int[] progresses, int[] speeds){




        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};
        solution(progresses,speeds); //  2,1
    }
}
