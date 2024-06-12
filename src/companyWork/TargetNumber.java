package companyWork;

public class TargetNumber {
    public int solution(int[] numbers, int target) {
        int answer = 0;

        /*
        n개의 음이 아닌 정수들이 있습니다. 이 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.

        -1+1+1+1+1 = 3
        +1-1+1+1+1 = 3
        +1+1-1+1+1 = 3
        +1+1+1-1+1 = 3
        +1+1+1+1-1 = 3
        사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.

        |   numbers     |target| return |
        [1, 1, 1, 1, 1]	 3	       5
        [4, 1, 2, 1]	 4	       2

        +4+1-2+1 = 4
        +4-1+2-1 = 4
         */

        /*
        깊이 우선 탐색(DFS)
         */





        return answer;
    }

    public void dfs(int[] numbers, int depth, int target, int sum){
        /*
        numbers : 알고리즘을 실행할 대상 배열
        depth : 노드의 깊이
        target : 타겟 넘버
        sum : 이전 노드 까지의 결과값

        마지막 노드까지 탐색했을 경우, 즉 depth 와 numbers 배열의 길이가 같을 때는 target 과 sum 값을 비교 하여 일치하면 answer 카운트 증가

        탐색할 노드가 남아있는 경우 이전 노드까지의 합에서 현재 노드 값을 더하고 빼는 두 가지 경우로 깊이 우선 탐색 알고리즘 재실행
         */


    }

    public static void main(String[] args) {

    }
}
