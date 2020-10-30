package refresh;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhanglujie
 * @since 2020-10-13 16:05
 */
public class LeetCode217 {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNum = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            uniqueNum.add(nums[i]);
            if (uniqueNum.size() < i + 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}
