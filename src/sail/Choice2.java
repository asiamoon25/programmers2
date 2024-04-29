package sail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Choice2 {
    public static String solution() {
        /*
            4 개의 미니어처
            quality    price
            3           1
            2           2
            2           3
            1           1

            1. 가장 높은 품질, 품질이 동일할 때 낮은 가격   -> 2번 반복
            2. 가장 낮은 가격, 가격이 동일할 때 높은 품질   -> 2번 반복
            result : 3 1 | 2 2
                     3 1 | 1 1
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String nStr = br.readLine();
            int n = Integer.parseInt(nStr);





        }catch(IOException e){
            e.printStackTrace();
        }

        return "";
    }

    public static void main(String[] args) {

    }
}
