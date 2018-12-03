package 数组_字符串;

import java.util.Arrays;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-03 22:49
 * @description 215
 */
public class FindKthElements {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(new FindKthElements().findKthLargest(nums, 2));
    }
}
