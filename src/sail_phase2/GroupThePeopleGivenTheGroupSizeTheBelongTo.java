package sail_phase2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeopleGivenTheGroupSizeTheBelongTo {
    /*
    알 수 없는 수의 그룹으로 나뉘어져 있는 n명의 사람들이 있습니다.
    각 사람에게는 0에서 n - 1 사이의 고유 ID가 부여됩니다.
    정수 배열 groupSizes가 주어지며, 여기서 groupSizes[i]는 사람 i가 속해 있는 그룹의 크기입니다.
    예를 들어 groupSizes[1] = 3이면 사람 1은 크기가 3인 그룹에 속해 있어야 합니다.
    각 사람 i가 groupSizes[i] 크기의 그룹에 속하는 그룹의 목록을 반환합니다.
    각 사람은 정확히 하나의 그룹에 나타나야 하며, 모든 사람은 한 그룹에 속해야 합니다.
    답이 여러 개 있으면 그 중 하나를 반환합니다.
    주어진 입력에 대해 하나 이상의 유효한 솔루션이 있다는 것이 보장됩니다.
    ---


    n명의 사람이 있고, 이 사람들은 몇 개의 그룹으로 나누어져 있습니다. 각 사람은 0부터 n - 1까지 고유한 ID를 가지고 있습니다.
    정수 배열 groupSizes가 주어집니다.
    여기서 groupSizes[i]는 사람 i가 속한 그룹의 크기를 나타냅니다.
    예를 들어, groupSizes[1] = 3이라면, 사람 1은 크기가 3인 그룹에 속해야 합니다.
    모든 사람이 groupSizes[i]에 맞는 크기의 그룹에 속하도록 그룹 리스트를 반환하세요.
    각 사람은 정확히 한 그룹에만 속해야 하며, 모든 사람은 반드시 그룹에 속해야 합니다.
    가능한 답이 여러 개일 경우, 그 중 하나를 반환하면 됩니다. 주어진 입력에 대해 유효한 솔루션이 적어도 하나는 존재함이 보장됩니다.
    정리하면, 각 사람 i가 속한 그룹의 크기가 groupSizes[i]인 그룹들을 찾아서 리스트 형태로 반환하는 것이 목표입니다.
     */
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        // output : {{5}, {0,1,2}, {3,4,6}}
        // 1개 밖에 없을 때 그룹 1 인 애들이 1명밖에 없음 5번 사람혼자
        /*
        나머지는 그룹사이즈가 3인 애들이므로 3을 이루어야함.

        {{5}, {0,1,2} ,{3,4,6}}
         */
        Map<Integer, List<Integer>> sizeToPeople = new HashMap<>();

        for(int i = 0; i < groupSizes.length; i++){
            int size = groupSizes[i];

            if(!sizeToPeople.containsKey(size)) {
                sizeToPeople.put(size, new ArrayList<>());
            }
            sizeToPeople.get(size).add(i);
        }

        List<List<Integer>> result = new ArrayList<>();

        for(Map.Entry<Integer, List<Integer>> entry : sizeToPeople.entrySet()) {
            int size = entry.getKey();
            List<Integer> people = entry.getValue();
            for(int i = 0; i < people.size(); i += size) {
                result.add(people.subList(i, i+size));
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] groupSizes = {3,3,3,3,3,1,3};
        List<List<Integer>> result = groupThePeople(groupSizes);

        for(int i = 0; i < result.size(); i++) {
            for(int j = 0; j < result.get(i).size(); j++){
                System.out.println(result.get(i).get(j));
            }
        }
    }
}
