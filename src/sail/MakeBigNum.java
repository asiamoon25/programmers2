package sail;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MakeBigNum {

    public static String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        char[] result = new char[number.length() - k];

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            // 스택이 비어있지 않고, k가 0보다 크며, 스택의 맨 위의 숫자가 현재 숫자보다 작으면
            while (!stack.isEmpty() && k > 0 && stack.peek() < c) {
                stack.pop(); // 스택에서 제거
                k--; // 제거 카운트 감소
            }
            stack.push(c); // 현재 숫자 스택에 삽입
        }

        // 결과 배열을 만듦
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }

        return new String(result);
    }

    public static void main(String[] args) {
        String number = "1231234";
        int k = 3;
        solution(number,k);
    }
}
