package sail_phase2;

import java.util.*;

public class TheFarthestNode {
    /*
    n개의 노드가 있는 그래프가 있습니다.
    각 노드는 1부터 n까지 번호가 적혀있습니다.
    1번 노드에서 가장 멀리 떨어진 노드의 갯수를 구하려고 합니다.
    가장 멀리 떨어진 노드란 최단경로로 이동했을 때 간선의 개수가 가장 많은 노드들을 의미합니다.
    노드의 개수 n, 간선에 대한 정보가 담긴 2차원 배열 vertex가 매개변수로 주어질 때,
    1번 노드로부터 가장 멀리 떨어진 노드가 몇 개인지를 return 하도록 solution 함수를 작성해주세요.
     */
    public static int solution(int n, int[][] edge) {
//        /*
//        bfs
//         */
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//
//        // 리스트 초기화
//        for(int i = 0; i < n; i++){
//            list.add(new ArrayList<>());
//        }
//
//        // 엣지 받아서 노드 생성
//        for(int[] edgeEl : edge) {
//            // 양방향?
//            list.get(edgeEl[0]-1).add(edgeEl[1]-1);
//            list.get(edgeEl[1]-1).add(edgeEl[0]-1);
//        }
//
//
//        int answer = 0;
//        return answer;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] connection : edge) {
            graph.get(connection[0]).add(connection[1]);
            graph.get(connection[1]).add(connection[0]);
        }

        int[] distances = new int[n + 1];
        Arrays.fill(distances, -1); // 초기 거리는 -1로 설정 (방문하지 않음을 의미)
        distances[1] = 0; // 1번 노드의 거리는 0

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        // BFS 실행
        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : graph.get(current)) {
                if (distances[neighbor] == -1) { // 아직 방문하지 않은 노드
                    distances[neighbor] = distances[current] + 1;
                    queue.add(neighbor);
                }
            }
        }

        int maxDistance = 0;
        for (int distance : distances) {
            if (distance > maxDistance) {
                maxDistance = distance;
            }
        }

        int count = 0;
        for (int distance : distances) {
            if (distance == maxDistance) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] edge = {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
        System.out.println(solution(n,edge)); // 3
    }

}
