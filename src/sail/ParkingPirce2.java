package sail;

public class ParkingPirce2 {
    public static int[] solution(int[] fees, String[] records) {
        /*
        기본 시간(분), 기본 요금(원), 단위 시간(분), 단위 요금(원) 이 주어지고 시각, 차번호, 입출입 기록 이 주어질 때 차량별 주차요금 계산
        IN 일 때 23:59 에 출차된걸로 간주
         */
        int[] answer = {};

        return answer;
    }

    public static void main(String[] args) {
        int[] fees ={180, 5000, 10, 600}; // 기본 시간 (분), 기본 요금(원), 단위 시간(분), 단위 요금(원)
        String[] records = { // 시각(시 : 분), 차량 번호, 내역
                "05:34 5961 IN",
                "06:00 0000 IN",
                "06:34 0000 OUT",
                "07:59 5961 OUT",
                "07:59 0148 IN",
                "18:59 0000 IN",
                "19:09 0148 OUT",
                "22:59 5961 IN",
                "23:00 5961 OUT"
        };

        solution(fees,records); // {14600, 34400, 5000}
    }
}
