package stackandqueue;

import java.sql.SQLOutput;
import java.util.*;

public class CorrectBucket {
    public static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        int close = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(') {
                stack.push(c);
            }else{
                close++;
                if(stack.size() != 0) {
                    stack.pop();
                    close -= 1;
                }else{
                    answer = false;
                    break;
                }
            }
        }
        if(stack.size() != close) {
            answer = false;
        }
        return answer;
    }
    public static void main(String[] args) {
        String s = "(((((((((((((((((((())))))))))))))))))))()(())((()))(((())))((((()))))(((((())))))((((((()))))))(((((((())))))))((((((((()))))))))";  // false
        solution(s);
    }
}
