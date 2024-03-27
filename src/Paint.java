public class Paint {

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        // 그리디 알고리즘 항상 최적의 상황을 고르는 것
        int[] arr = new int[n];

        int start = section[0];
        answer++;

        for(int item : section){
            if(start + m > item){
                continue; // 아래거 안타고 for 문 계속 돔.
            }
            start = item;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        int[] section = {1,3};
        solution(n,m,section);
    }
}
