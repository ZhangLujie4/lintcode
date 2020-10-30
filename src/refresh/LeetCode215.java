package refresh;

import java.util.Arrays;

/**
 * @author zhanglujie
 * @since 2020-10-26 20:15
 */

public class LeetCode215 {

    // todo 堆实现
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums, 4));
    }
}
