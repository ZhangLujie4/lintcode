package 数组_字符串;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-04 15:55
 * @description 220
 */
public class ContainsDuplicateIII {

    /**
     * 最大步长为k，值得差最大为t,防止溢出
     * @param nums
     * @param k
     * @param t
     * @return
     */

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        int n = nums.length;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<=i+k && j<n; j++) {
                long result = (long)nums[i]-(long)nums[j];
                if (Math.abs(result) <= t) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, -2147483647};
        System.out.println(new ContainsDuplicateIII().containsNearbyAlmostDuplicate(nums, 1, 2147483647));
    }
}
