import java.util.*;

public class BestAlbum {
    public static int[] solution(String[] genres, int[] plays) {
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
        String[] arr = new String[bestGenre.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = bestGenre.pollLastEntry().getKey();
        }
        // ----------
        Map<Integer, List<Integer>> map = new HashMap<>(); // Integer : genre 의 index, List : genre 에 대한 plays 의 index
        for(int i = 0; i < arr.length; i++){
            String genre = arr[i];
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < plays.length; j++){
                if(genre.equals(genres[j])){
                    list.add(j);
                }
            }
            map.put(i,list);
        }


        for(int i = 0; i < map.size(); i++) {
            List<Integer> playsIndexes = map.get(i);
            Collections.sort(playsIndexes, (o1,o2) -> plays[o2] - plays[o1]);
            int play = plays[playsIndexes.get(0)]; // 최대값
            for(int j = 0; j < playsIndexes.size(); j++){
                if(play == plays[j]) {
                    playsIndexes.set(0,0);
                }
            }
            map.put(i, playsIndexes.subList(0,2));
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < map.size(); i++){
            result.addAll(map.get(i));
        }
        System.out.println(Arrays.toString(result.toArray()));
        int[] answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        solution(genres, plays);
    }
}