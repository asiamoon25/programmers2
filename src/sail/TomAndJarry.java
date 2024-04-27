package sail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TomAndJarry {
    public static String solution(){

        /*
        필요한 변수
        분자, 분모 저장할 수
         */
        /*
          변수 3개
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try{
            String nStr = br.readLine();
            n = Integer.parseInt(nStr);
            long[] arr = new long[n];
            for(int i = 0; i < n; i++){
                long inputLong = Long.parseLong(br.readLine());
                arr[i] = inputLong;
            }
            long a = arr[arr.length-1];
            long sangsu = 1;
            long bunja = 0L;
            long bunmo = 0L;
            for(int i = arr.length-2; i >= 0; i--){
                long b = arr[i];

                bunmo = a;
                bunja = a * b + sangsu;

                long temp = 0L;

                temp = bunmo;

                bunmo = bunja;
                bunja = temp;
                sangsu = bunja;
                a = bunmo;
            }


            long last = bunmo - bunja;

            String stArr = last+" "+bunmo;
            return stArr;
        }catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try{
            String nStr = br.readLine();
            n = Integer.parseInt(nStr);
            String[] ar = br.readLine().split(" ");
            long[] arr = new long[n];
            for(int i = 0; i < ar.length; i++){
                long inputLong = Long.parseLong(ar[i]);
                arr[i] = inputLong;
            }
            long a = arr[arr.length-1];
            long sangsu = 1;
            long bunja = 0L;
            long bunmo = 0L;
            for(int i = arr.length-2; i >= 0; i--){
                long b = arr[i];

                bunmo = a;
                bunja = a * b + sangsu;

                long temp = 0L;

                temp = bunmo;

                bunmo = bunja;
                bunja = temp;
                sangsu = bunja;
                a = bunmo;
            }


            long last = bunmo - bunja;

            String stArr = last+" "+bunmo;
            System.out.println(stArr);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
