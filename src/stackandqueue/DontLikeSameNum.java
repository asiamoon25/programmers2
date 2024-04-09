package stackandqueue;

import java.util.*;
import java.util.function.Consumer;

public class DontLikeSameNum {
    /*
    배열 arr 가 주어짐.
    배열 arr 의 각 원소는 숫자 0부터 9까지로 이루어져 있음.
    배열 arr 에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거.
    단, 제거된 후 남은 수들을 반환할 때는 배열 arr 의 원소들의 순서를 유지해야함.
    배열 arr 에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수 작성

    제한 사항
    1. 배열 arr의 크기 : 1,000,000 이하의 자연수
    2. 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

    중복된 녀석들을 지우는거임
     */
    public static int[] solution(int[] arr) {

        Queue<Integer> queue = new LinkedList<>();
        //Queue 에 배열 집어 넣음
        for(int i = 0; i < arr.length; i++){
            queue.add(arr[i]);
        }

        int qSize = queue.size();
        List<Integer> list = new LinkedList<>();
        Integer prev = -1;
        for(int i = 0; i < qSize; i++){

            if(prev != queue.peek()){
                list.add(queue.peek());
            }
            prev = queue.poll();
        }


        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1}; // 1,3,0,1
        solution(arr);
    }
}
