package sail;

public class NLcm {
    public static int solution(int[] arr) {
        int answer = 0;

        /*
        N개의 최소공배수
        lcm (a,b) = |a*b| / gcd(a,b)
        (a*b) /(a,b 의 최대 공약수)
        최대 공약수 는 유클리드 호제법을 통해서 구할 수 있음.

        최대 공약수는 서로 나눈 나머지가 0이 될 때까지 나누면 됨.
        배열로 인해 여러 숫자가 들어온다면? 최대 공약수의 공약수의 공약수의...
        gcd(a,b,c,d) => gcd(gcd(a,b),c,d) => gcd(gcd(gcd(a,b),c),d)
         */

        if(arr.length == 1) {
            return arr[0];
        }

        int gcd = getGCD(arr[0],arr[1]); // 배열 첫번째와 두번쨰값으로 먼저 최대 공약수를 구한다음에

        int lcm = arr[0] * arr[1] / gcd; // 최소 공배수를 구함.

        for(int i =2; i < arr.length; i++){ // 그 후에 for문으로 그 이후에 최소공배수 최대공약수 를 구하면 된다.
            gcd = getGCD(lcm, arr[i]);
            lcm = (lcm * arr[i])/ gcd;
        }
        return lcm;
    }

    public static int getGCD(int num1, int num2){

        if(num1 % num2 == 0) {
            return num2;
        }

        return getGCD(num2, num1 % num2);
    }
    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        solution(arr); // 168
    }
}
