package sail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;import java.util.List;

public class Game2 {
    public static int solution() {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            int d = Integer.parseInt(br.readLine());
            int y1 = 0;
            int x1 = 0;
            List<Integer> list = new ArrayList<>();
            
            boolean isTrue = true;
            while(isTrue) {
                int count = 0;
                int y2 = 0;
                int x2 = 0;
                for(int i = 0; i < n*m; i++){
                    if(y2 == n && x1 == m){
                        break;                        
                    }
                    int result = 0;
                    if(y1 != y2 || x1!=x2){
                        int x = x1 -x2 < 0 ? (x1 -x2) * -1 : x1 -x2;
                        int y = y1 -y2 < 0 ? (y1-y2) * -1 : y1-y2;
                        result  = x + y;
                        System.out.println("두 택시의 거리 : "  + result + ", 준성 : " + "("+ y1 + ", "+ x1 + ")" + ", 효석 : " + "(" + y2 + ", " + x2 + ")");
                        if(result >= d){
                            count++;
                        }
                    }
                    if(x2 == m -1) {
                        y2+=1;    
                        x2 = 0;
                    }else{
                        x2+=1;
                    }
                }
                
                list.add(count);
                
                if(x1 == m -1){
                    x1 = 0;
                    y1+= 1;
                }else{
                    x1+=1;
                }
                
                if(x1 == m -1 && y1 == n -1){
                    isTrue = false;
                }
            }
            System.out.println(Arrays.toString(list.toArray()));
            int answer = Collections.min(list);
            
            System.out.println(answer);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        solution();
    }
}
