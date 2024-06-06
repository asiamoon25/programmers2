package sail;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 거리두기 게임
public class Game {
    public static int solution() {

        /*
        준성이와 효석이는 N x M 크기의 격자판 위에서 게임을 하고 있다. 규칙은 다음과 같음.
         1. 준성이와 효석이는 각자 말 한 개씩 가지고 시작한다.
         2. 효석이는 준성이가 말을 둘 수 없는 격자 칸 A개를 정한다.
         3. 준성이는 말을 둘 수 있는 격자 칸 중 하나에 말을 두고, 효석이는 준성이가 말을 둔 격자 칸을 제외한 모든 격자 칸 중 하나에 말을 둔다.
         4. 두 말 사이의 택시 거리가 D 보다 작으면 준성이가, 같으면 효석이가 승리한다.

         준성이와 효석이가 최선을 다해 게임을 진행했을 때, 효석이가 승리할 수 있는 A의 최솟값을 구하여라
         단, 효석이가 승리할 수 없는 경우는 입력으로 주어지지 않는다.

         준석이가 (0,0) 일 때 효석이가 이길 수 있는 수
         준석이가 (0,1) 일 때 효석이가 이길 수 있는 수
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] array = br.readLine().split(" ");
            //세로 길이인 정수 N
            int n = Integer.parseInt(array[0]);
            // 가로 길이인 정수 M
            int m = Integer.parseInt(array[1]);
            int distance = Integer.parseInt(br.readLine()) - 1;
            
            for(int i = 0; i < n; i++){
                // i , j 값 추출
                for(int j = 0; j < m; j++){

                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }


        return 0;
    }

    public static void main(String[] args) {
        solution();
    }
}
