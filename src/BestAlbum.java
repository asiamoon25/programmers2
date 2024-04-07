import java.util.*;

public class BestAlbum {
    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        // 속한 노래가 많이 재생된 장르를 먼저 수록 -> Map 에 넣고 최대값 -> TreeMap
        TreeMap<String,Integer> bestGenre = new TreeMap<>();
        for(int i = 0; i < genres.length; i++){
            if(bestGenre.containsKey(genres[i])) {
                int a = plays[i];
                int b = bestGenre.get(genres[i]);
                bestGenre.put(genres[i], a +b);
            }else{
                bestGenre.put(genres[i], plays[i]);
            }
        }
        // 이제 이렇게 하면 플레이 수가 낮은 대로 map 이 나옴.

        // 마지막에서 하나씩 제거하면서 꺼내면...?


        // 장르 내에서 많이 재생된 노래를 먼저 수록 -> lastKey 를 뽑아서 genres 안에서 index 수 뽑기 -> list


        // 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록 ->


        return answer;
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        solution(genres, plays);
    }
}