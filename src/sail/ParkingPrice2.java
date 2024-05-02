package sail;

import java.util.*;

public class ParkingPrice2 {
    public static int[] solution(int[] fees, String[] records) {
        /*
        기본 시간(분), 기본 요금(원), 단위 시간(분), 단위 요금(원) 이 주어지고 시각, 차번호, 입출입 기록 이 주어질 때 차량별 주차요금 계산
        IN 일 때 23:59 에 출차된걸로 간주
         */

        int[] answer = {};

        int defaultMinute = fees[0];
        int defaultPrice = fees[1];
        int perMinute = fees[2];
        int perPrice = fees[3];

        Map<String, Integer> inStatus = new HashMap<>();
        Map<String, Integer> outStatus = new HashMap<>();
        for(String record : records){
            String[] arr = record.split(" ");
            String carNumber = arr[1];
            String status = arr[2];


            if(status.equals("IN")) {
                inStatus.put(carNumber, inStatus.getOrDefault(carNumber,0) + 1);
            }else{
                outStatus.put(carNumber, outStatus.getOrDefault(carNumber,0) + 1);
            }
        }

        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        for(String record : records) {
            String[] arr = record.split(" ");
            String carNumber = arr[1];
            String status = arr[2];
            int totalMinute = Integer.parseInt(arr[0].split(":")[0])* 60 + Integer.parseInt(arr[0].split(":")[1]);

            if(status.equals("IN")){
                if(inStatus.containsKey(carNumber)) {
                    map.put(carNumber, map.getOrDefault(carNumber,0)+totalMinute);
                }
            }else{
                if(outStatus.containsKey(carNumber)){
                    int plusTime = 0;
                    if(inStatus.get(carNumber) > outStatus.get(carNumber)){
                        plusTime = 23*60 + 59;
                    }
                    map2.put(carNumber, map2.getOrDefault(carNumber,0)+totalMinute + plusTime);
                }
            }
        }
        System.out.println(map.toString());
        System.out.println(map2.toString());
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        List<Integer> result = new ArrayList<>();
        // 180, 5000, 10, 600
        for(String carNumber : keySet) {


            int totalTime = map2.get(carNumber) - map.get(carNumber);
            int overTime = 0;
            if(totalTime > defaultMinute){
                overTime = (totalTime - defaultMinute) % perMinute  == 0? (totalTime - defaultMinute) / perMinute : (totalTime - defaultMinute) / perMinute + 1;
            }

            int won = defaultPrice + (overTime) * perPrice;

            result.add(won);

        }
        answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {
        int[] fees ={1, 461, 1, 10}; // 기본 시간 (분), 기본 요금(원), 단위 시간(분), 단위 요금(원)
        String[] records = { // 시각(시 : 분), 차량 번호, 내역
                "00:00 1234 IN"
        };

        solution(fees,records); // {14600, 34400, 5000}
    }
}
