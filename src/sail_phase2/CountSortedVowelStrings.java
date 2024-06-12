package sail_phase2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CountSortedVowelStrings {
    /*
    정수 n이 주어지면, 모음(a, e, i, o, u)로만 구성되고 사전순으로 정렬된 길이 n의 문자열 수를 반환합니다.

    모든 유효한 i에 대해 s[i]가 알파벳에서 s[i+1]과 같거나 앞에 오면 문자열 s는 사전순으로 정렬됩니다
     */
    public int countVowelStrings(int n) {

        String[] arr = {"a","e","i","o","u"};
        Queue<String> q = new LinkedList<>(Arrays.stream(arr).toList());




        return 0;
    }
}
