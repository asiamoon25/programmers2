import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DataAnalize {
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};

        Map<String,Integer> col = new HashMap<>();

        col.put("code",0);
        col.put("date",1);
        col.put("maximum",2);
        col.put("remain",3);

        int[][] filteredData = Arrays.stream(data).filter(x-> x[col.get(ext)] < val_ext).toArray(int[][]::new);
        Arrays.sort(filteredData, ((o1, o2) -> o1[col.get(sort_by)] - o2[col.get(sort_by)]));


        return filteredData;
    }


    public static void main(String[] args) {
        int[][] data = {
            //  code, date, maximum, remain
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8}
        };
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        System.out.println(Arrays.deepToString(solution(data,ext,val_ext,sort_by)));
    }
}
/*
데이터 분석 작업 진행 중

data = {{code 번호, 제조일, 최대 수량, 현재 수량}}
이 데이터들 중 조건을 만족하는 데이터만 뽑아서 정렬
data = {{3,20300401, 10, 8},{1, 20300104, 100, 80}}

정렬한 데이터들이 담긴 이차원 정수 리스트 data 와 어떤 정보를 기준으로 데이터를
뽑아낼지를 의미하는 문자열 ext, 뽑아낼 정보의 기준값을 나타내는 정수 val_ext,
정보를 정렬할 기준이 되는 문자열 sort_by 가 주어짐

data 에서 ext 값이 val_ext 보다 작은 데이터만 뽑은 후, sort_by 에 해당하는
값을 기준으로 오름차순으로 정렬하여 return 하도록 함수를 완성하라.

 */