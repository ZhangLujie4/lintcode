package 数组_字符串;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-03 19:51
 * @description 209
 */

/**
 * 无子数组符合条件返回0
 * sum >= s
 */
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        int size = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=i; j<n; j++) {
                sum += nums[j];
                if (sum >= s) {
                    if (size > (j - i + 1)) {
                        size = (j - i + 1);
                        break;
                    }
                }
            }
        }
        return size==Integer.MAX_VALUE?0:size;
    }

    public static void main(String[] args) {

        int[] nums = {1,1};
        System.out.println(new MinimumSizeSubarraySum().minSubArrayLen(3, nums));
    }
}
