package sail_phase2;


public class CountSquareSubmatricesWithAllOnes {

    /*
    1과 0으로 구성된 행렬이 주어지면 모두 1로 구성된 정사각형 m*n 의 부분 행렬의 수를 반환함.
    ㄴ> 정사각형이 몇 개인지 확인하면 됨.
     */
    public static int countSquares(int[][] matrix) {
        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0 && i > 0 && j > 0) {
                    matrix[i][j] = Math.min(
                            matrix[i - 1][j - 1], Math.min(matrix[i - 1][j], matrix[i][j - 1])
                    ) + 1;
                }
                ans += matrix[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,1,1},{1,1,1,1},{0,1,1,1}};

        int answer = countSquares(matrix); // 15
    }
}
