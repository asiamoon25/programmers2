package sail_phase2;

import java.util.LinkedList;
import java.util.Queue;

public class GameMap {
    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/1844
    게임 맵 최단 거리
     */

    /*
    최단 거리는 BFS...
     */

    public static int solution(int[][] maps) {
        /*
        1. Queue 사용
        2. 방문 체크
        3. 4방향 탐색
        4. 경계 및 벽 체크
        5. 목표 지점 도달 체크


        Tip

        1. 큐 초기화 : 시작 위치와 거리를 큐에 넣고, 방문 체크 배열에 시작 위치를 방문한 것으로 표시
        2. 큐가 빌 때까지 반복 : 큐에서 위치와 거리를 꺼내서 4방향으로 이동을 지시
        3. 방문하지 않은 위치로 이동 : 이동할 위치가 유효하고 방문하지 않은 경우, 큐에 새로운 위치와 거리를 넣고 방문 체크를 함.
        4. 목표 지점 도달 시 종료 : 목표 지점에 도달하면 즉시 현재까지의 거리를 반환함.
        5. 큐가 빌 때까지 목표 지점에 도달하지 못한 경우 : BFS 탐색이 끝날 때 까지 목표 지점에 도달하지 못하면 -1 을 반환함.
         */

        int n = maps.length;
        int m = maps[0].length;

        // 방향 배열(상,하,좌,우)
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0, -1, 1};

        //방문 체크 배열
        boolean[][] visited = new boolean[n][m];

        //BFS 를 위한 큐
        Queue<int[]> queue = new LinkedList<>();

        //시작 위치와 거리 (x,y, distance)
        queue.add(new int[] {0,0,1});
        visited[0][0] = true;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];

            // 목표 지점 도달 시 거리 반환
            if(x==n-1 && y == m-1){
                return distance;
            }

            // 4 방향 탐색
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                //맵 경계 내에 있고, 벽이 아니며, 방문하지 않은 위치
                if(nx >= 0 && ny >= 0 && nx < n && ny <m && maps[nx][ny] == 1 && !visited[nx][ny]){
                    queue.add(new int[] {nx,ny,distance + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;

        /*
        1. 방문 체크 : 이미 방문한 위치를 재방문하지 않도록 방문 체크 배열을 사용하여 시간 복잡도를 줄임
        2. 4방향 탐색 : 방향 배열을 사용하여 코드의 간결성을 유지함.
        3. 큐를 사용한 탐색 : BFS 의 특성을 이용해 최단 거리를 보장함.
         */
    }

    public static void main(String[] args) {

        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};

        System.out.println(solution(maps));
    }
}
