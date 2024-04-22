package sail;

public class TomAndJarry {
    public static String[] solution(int n, int[] a){

        /*
        필요한 변수
        분자, 분모 저장할 수
         */
        int first = a[a.length -1];
        int firstBunja = 1;
        for(int i = a.length -2; i >= 0; i--){

            int num = a[i]; // 원래 배열의 숫자
            firstBunja = a[i] * first + firstBunja;
            int bunmo = num;

            int temp = 0;

            temp = firstBunja;
            firstBunja = bunmo;
            bunmo = temp;



            System.out.println("분자 : " + firstBunja);
            System.out.println("분모 : " + bunmo);
            break;
        }

        return null;
    }
    

    public static int[] yeonbunsoo(int a, int b) {

        int boonmo = a*b + 1;
        int boonja = b;

        int[] arr = new int[2];

        arr[0] = boonmo;
        arr[1] = boonja;


        return arr;
    }

    public static void main(String[] args) {

        int n = 4;
        int[] a = {2,7,1,8};

        solution(4, a);
    }
}
