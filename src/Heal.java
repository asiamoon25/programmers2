import java.util.HashMap;
import java.util.Map;

public class Heal {
    public static int solution(int[] bandage, int health, int[][] attacks) {

        int totalTime = attacks[attacks.length -1][0]; // 마지막 공격 시간 까지 계속 힐 함.
        int castTime = bandage[0]; // 시전 시간
        int healPerSecond = bandage[1]; // 초당 회복 시간
        int bonusHeal = bandage[2]; // 시전 횟수가 온전히 다 되면 추가 회복하는 양

        int currentHealth = health;
        int successCount = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // 공격 시간, 데미지 -> map 에 넣음.
        for(int j = 0; j < attacks.length; j++){
            map.put(attacks[j][0], attacks[j][1]);
        }
        // 총 시간 만큼의 for
        for(int i = 1; i <= totalTime; i++){
            // 공격
            if(map.containsKey(i)) {
                int damage = map.get(i);
                currentHealth -= damage;

                if(currentHealth <= 0) {
                    currentHealth = -1;
                    break;
                }
                successCount = 0;
            }else{ // 공격 안당할 때
                if(currentHealth < health){
                    currentHealth += healPerSecond;
                    successCount++;
                }else{
                    currentHealth = health;
                }
            }

            if (successCount == castTime){
                currentHealth += bonusHeal;
                successCount = 0;
            }
        }
        return currentHealth;
    }

    public static void main(String[] args) {
        int answer = 0;
        int[] bandage = {5,1,5};
        int health = 30;
        int[][] attacks = {{2,10},{9,15},{10,5}, {11,5}};

        int result = solution(bandage,health,attacks);
        System.out.println(result);
    }

}
