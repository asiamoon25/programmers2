package companyWork;

public class AllSearch {

    /*
    Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.

    Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.

    제한사항
        갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
        노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
        카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
     */
    public static int[] solution(int brown, int yellow) {
        int[] answer = {};

        // brown 은 3 <= brown
        // yellow 는 1<= yellow

        // brown 은 어차피 둘레 아님? 둘레 8인 직사각형 (높이 + 밑변) * 2 = ?
        /*
        아 그래서 완전 탐색
         */
        return answer;
    }

    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;

        solution(brown, yellow); // [4,3]
    }
}
