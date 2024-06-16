package sail_phase2;

public class FindTheOriginalArrayOfPrefixXor {
    /*
    n 크기의 정수 배열 pref가 주어졌을 때, 이를 만족하는 n 크기의 배열 arr을 찾아 반환합니다:
    pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
    ^ 는 비트-xor 연산을 나타냅니다.
    답이 유일하다는 것을 증명할 수 있습니다.
     */
    public static int[] findArray(int[] pref) {
        if (pref == null || pref.length == 0) {
            // 입력 배열이 null이거나 비어 있는 경우 빈 배열 반환
            return new int[0];
        }

        int n = pref.length;
        int[] arr = new int[n];

        // arr[0]은 pref[0]과 동일합니다.
        arr[0] = pref[0];

        // 나머지 arr[i]는 pref[i] ^ pref[i-1]으로 구할 수 있습니다.
        for (int i = 1; i < n; i++) {
            arr[i] = pref[i] ^ pref[i - 1];
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println((5^7));
    }

}
