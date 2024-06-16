package codingtest.hubdnc;

public class Permutation {
    public static int solution(int n, int r) {

        /*
        nPr = n(n-1)...(n-r+1)
         */

        int result = 1; // 처음은 1

        for(int i = n; i >= (n-r)+1; i--){
            result *= i;
        }


        return result;
    }

    static int permutation(int n, int r) {



        return 0;
    }

    public static void main(String[] args) {
        int n = 4;
        int r = 3;

        System.out.println(solution(n,r));
    }
}
