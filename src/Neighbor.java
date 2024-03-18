import java.util.Arrays;

public class Neighbor {
    public static int solution(String[][] board, int h, int w) {

        int h1 = h-1; // 0
        int h2 = h+1; // 2
        int w1 = w-1; // 0
        int w2 = w+1; // 2

        String boardColor = board[h][w];

        int count = 0;

        // (1,0),(2,1), (0, 1), (2,1)
        int[][] hwArr = {{h1,w},{h2,w},{h,w1},{h,w2}};

        for(int i = 0; i < hwArr.length; i++){
            int hIndex = hwArr[i][0];
            int wIndex = hwArr[i][1];
            if((hIndex >= 0 && hIndex < board.length) && (wIndex >= 0 && wIndex < board.length)){
                if(boardColor.equals(board[hIndex][wIndex])){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {

        String[][] board = {
                {"yellow", "green"},
                {"blue", "green"}

        };
        int h = 0;
        int w = 1;
        solution(board,h,w);
    }
}
