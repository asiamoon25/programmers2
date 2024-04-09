import java.util.*;

public class BestAlbum {
    public static int[] solution(String[] genres, int[] plays) {


        // map 에 장르, 플레이 수 넣기
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            if(map.containsKey(genres[i])){
                map.put(genres[i], map.get(genres[i]) + plays[i]);
            }else {
                map.put(genres[i], plays[i]);
            }
        }
        // play 최대값을 가진 장르 뽑기
        List<String> genresList = new ArrayList<>(map.keySet());

        genresList.sort((o1,o2) -> map.get(o2) - map.get(o1)); // map 의 value 에서 최대값을 가진 애들로 List 정렬

        List<Integer> result = new ArrayList<>();

        for(String genre : genresList) {
            HashMap<Integer, Integer> playMap = new HashMap<>();
            for(int i = 0; i < genres.length; i++){
                if(genre.equals(genres[i])) {
                    playMap.put(i,plays[i]);
                }
            }
            // plays 저장한 key 값 -> index
            List<Integer> playsList = new ArrayList<>(playMap.keySet());
            playsList.sort((o1,o2) -> playMap.get(o2) - playMap.get(o1));

            result.addAll(playsList.size() < 2 ? playsList : playsList.subList(0,2));
        }

        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();

        return answer;
//        return null;
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
//        System.out.println(genres.length);
//        System.out.println(plays.length);
        solution(genres, plays);
    }
}