package refresh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zhanglujie
 * @since 2020-10-26 20:24
 */
public class LeetCode18 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < length - 3; i++) {
            for (int j = i + 1; j < length - 2; j++) {
                int k = j + 1;
                int l = length - 1;
                while (k < l) {
                    int cal = nums[i] + nums[j] + nums[k] + nums[l];
                    if (cal == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k++], nums[l--]));
                    } else if (cal < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(nums, 0));
    }
}
