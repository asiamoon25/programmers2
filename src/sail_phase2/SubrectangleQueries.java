package sail_phase2;

public class SubrectangleQueries {
    /*
    생성자에서 행 x 열의 직사각형을 정수 행렬로 받고 두 가지 메서드를 지원하는 SubrectangleQueries 클래스를 구현합니다:
    updateSubrectangle(int row1, int col1, int row2, int col2, int newValue)
    좌측 상단 좌표가 (row1,col1), 우측 하단 좌표가 (row2,col2)인 사각형의 모든 값을 newValue로 업데이트합니다.
    2. getValue(int row, int col)
    사각형에서 좌표 (행,색)의 현재 값을 반환합니다.
     */
    int[][] arr;
    public SubrectangleQueries(int[][] rectangle) {
        this.arr = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        // 0, 0, 3, 2, 5


        for(int i = row1; i <= row2; i++){
            for(int j = col1; j <= col2; j++){
                arr[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {

        return arr[row][col];
    }

    public int[][] getArrayOutput(){

        return arr;
    }

    static class TestClass{
        public static void main(String[] args) {
            int[][] input = {{1,2,1},{4,3,4},{3,2,1},{1,1,1}};
            // [[[1,2,1],[4,3,4],[3,2,1],[1,1,1]]]
            SubrectangleQueries sq = new SubrectangleQueries(input);

            int[][] rr = sq.getArrayOutput();

            for(int i = 0; i < rr.length; i++){
                for(int j = 0; j < rr[i].length; j++){
                    System.out.print(rr[i][j]+ " ");
                }
                System.out.println();
            }

            int getVal = sq.getValue(0,2);

            System.out.println(getVal);

            sq.updateSubrectangle(0,0,3,2,5);

            rr = sq.getArrayOutput();
            for(int i = 0; i < rr.length; i++){
                for(int j = 0; j < rr[i].length; j++){
                    System.out.print(rr[i][j]+ " ");
                }
                System.out.println();
            }

            System.out.println(sq.getValue(0,2));
            System.out.println(sq.getValue(3,1));

            sq.updateSubrectangle(3,0,3,2,10);
            rr = sq.getArrayOutput();

            for(int i = 0; i < rr.length; i++){
                for(int j = 0; j < rr[i].length; j++){
                    System.out.print(rr[i][j]+ " ");
                }
                System.out.println();
            }


            System.out.println(sq.getValue(3,1));
            System.out.println(sq.getValue(0,2));
        }
    }
}
