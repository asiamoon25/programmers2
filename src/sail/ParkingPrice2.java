package sail;

import java.util.*;

public class ParkingPrice2 {
    public static int[] solution(int[] fees, String[] records) {
        /*
        기본 시간(분), 기본 요금(원), 단위 시간(분), 단위 요금(원) 이 주어지고 시각, 차번호, 입출입 기록 이 주어질 때 차량별 주차요금 계산
        IN 일 때 23:59 에 출차된걸로 간주
         */
        Map<String,Integer> map = new HashMap<>();
        Map<String, Integer> feeMap = new HashMap<>();

        for(String record : records) {
            String[] arr = record.split(" ");
            String carNumber = arr[1];
            map.put(carNumber, map.getOrDefault(carNumber,0) + 1);
        }

        for(String record : records) {
            String[] arr = record.split(" ");
            String timeStr = arr[0];
            String carNumber = arr[1];
            String status = arr[2];

            int time = Integer.parseInt(timeStr.split(":")[0]) * 60 + Integer.parseInt(timeStr.split(":")[1]);
            int countByCarNumber = map.get(carNumber);

            if(countByCarNumber % 2 != 0) {
                int time2 = 23*60 + 59;
                map.put(carNumber, map.getOrDefault(carNumber,0) + 1);
                feeMap.put(carNumber, feeMap.getOrDefault(carNumber, 0) - time2);
            }


            if("IN".equals(status)){
                feeMap.put(carNumber, feeMap.getOrDefault(carNumber,0) + time);
            }else{
                feeMap.put(carNumber, feeMap.getOrDefault(carNumber,0) - time);
            }
        }

        int defaultMinute = fees[0];
        int defaultPrice = fees[1];
        int overMinute = fees[2];
        int perMinute = fees[3];

        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        List<String> carNumbers = new ArrayList<>(feeMap.keySet());
        Collections.sort(carNumbers);
        for(String carNumber : carNumbers) {
            int totalTime = feeMap.get(carNumber) < 0 ? feeMap.get(carNumber) * -1 : feeMap.get(carNumber);

            int overTime = (totalTime - defaultMinute) % overMinute == 0 ? (totalTime - defaultMinute)/overMinute : (totalTime - defaultMinute)/overMinute + 1;
            int price = defaultPrice + overTime * perMinute;
            if(totalTime - defaultMinute <= 0) {
                price = defaultPrice;
            }

            list.add(price);
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        int[] fees ={180, 5000, 10, 600}; // 기본 시간 (분), 기본 요금(원), 단위 시간(분), 단위 요금(원)
        String[] records = { // 시각(시 : 분), 차량 번호, 내역
                "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"
        };

        solution(fees,records); // {14600, 34400, 5000}
    }
}
