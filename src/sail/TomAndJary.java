package sail;

public class TomAndJary {
    public static int[] solution(int n, int[] a) {

        for(int i = a.length-1; i >=0; i--){

        }
        return new int[]{0,0};
    }
    public static int[] flame(int b, int c, int d){
        /*
        b => 8
        d => 1
        c => 1

        bunmo = b
        bunja = b * c + d
         */

        int bunmo = b * c + d;
        int bunja = b;

        System.out.println("분자 : "+ bunja);
        System.out.println("분모 : "+ bunmo);


        return new int[]{bunmo, bunja};
    }
    public static void main(String[] args) {
        int n = 4;
        int[] a = {2,7,1,8};
        solution(n,a);
    }
}
