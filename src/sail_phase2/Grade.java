package sail_phase2;

public class Grade {
    /*
    n명의 권투선수가 권투 대회에 참여했고 각각 1번부터 n번까지 번호를 받았습니다.
    권투 경기는 1대1 방식으로 진행이 되고, 만약 A 선수가 B 선수보다 실력이 좋다면 A 선수는 B 선수를 항상 이깁니다.
    심판은 주어진 경기 결과를 가지고 선수들의 순위를 매기려 합니다. 하지만 몇몇 경기 결과를 분실하여 정확하게 순위를 매길 수 없습니다.
    선수의 수 n, 경기 결과를 담은 2차원 배열 results가 매개변수로 주어질 때 정확하게 순위를 매길 수 있는 선수의 수를 return 하도록
    solution 함수를 작성해주세요.
     */
    public static int solution(int n, int[][] results) {
        /*
        선수의 수는 1명 이상 100명 이하입니다.
        경기 결과는 1개 이상 4,500개 이하입니다.
        results 배열 각 행 [A, B]는 A 선수가 B 선수를 이겼다는 의미입니다.
        모든 경기 결과에는 모순이 없습니다.
         */

        /*
        플로이드 와샬 알고리즘
        n명의 선수가 있을 때 나를 제외한 n-1명과의 경기 결과를 알면 나의 순위를 알 수 있다.
        위의 예제에서 보았듯이 5명의 선수 중 4위 선수에게 패배했을 때 나의 순위는 5위가 된다. n-1명과 경기를 안 펼쳐도 내 순위를 알 수 있다.
        예시로 b선수가 a선수를 이겼다. a선수는 c선수를 이겼다. 그렇다면 b선수와 c선수는 경기를 치루지 않아도 선수가 c선수보다 순위가 높다.
        즉, b > a && a > c 이면 b > c이다.
        이를 이용하여 플로이드 와샬 알고리즘을 수행한 후 한 선수에 대해 n-1 선수의 승/패 정보를 알면 순위를 알 수 있다.
         */

        int[][] graph = new int[n+1][n+1];
        for(int[] edge : results) {
            graph[edge[0]][edge[1]] = 1;
            graph[edge[1]][edge[0]] = -1;
        }

        // O(n^3)
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <=n; k++){
                    if(graph[i][k] == 1 && graph[k][j] ==1) {
                        graph[i][j] = 1;
                        graph[j][i] = -1;
                    }

                    if(graph[i][k] == -1 && graph[k][j] == -1) {
                        graph[i][j] = -1;
                        graph[j][i] = 1;
                    }
                }
            }
        }

        int answer = 0;

        for(int i = 0; i <= n; i++){
            int count = 0;
            for(int j = 0; j <= n; j++){
                if(graph[i][j] != 0) count ++;
            }
            if(count == n-1) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] results = {{4,3},{4,2},{3,2},{1,2},{2,5}};

        /*
        2번 선수는 [1, 3, 4] 선수에게 패배했고 5번 선수에게 승리했기 때문에 4위입니다.
        5번 선수는 4위인 2번 선수에게 패배했기 때문에 5위입니다.
         */
        System.out.println(solution(n, results)); // 2
    }
}
