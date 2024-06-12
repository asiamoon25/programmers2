package companyWork;

import java.util.*;

public class CountPairs {
    public static int countPairs(List<Integer> nums, int target) {

        return 0;
    }

    public static void main(String[] args) {
        int[] numsArr = {-1,1,2,3,1};
        int target = 0;
        List<Integer> nums = new ArrayList<Integer>(Arrays.stream(numsArr).boxed().toList());
        System.out.println(countPairs(nums, target));
    }
}
