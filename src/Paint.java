public class Paint {

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        // 그리디 알고리즘 항상 최적의 상황을 고르는 것
        int[] arr = new int[n];

        int start = section[0];
        answer++;

        for(int item : section){
            if(start + m > item){
                continue;
            }

            start = item;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2,3,6};
        solution(n,m,section);
    }
}
