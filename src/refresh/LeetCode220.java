package refresh;

/**
 * @author zhanglujie
 * @since 2020-10-13 19:46
 */
public class LeetCode220 {

    // todo 超出时间
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j <= i + k && j < length; j++) {
                if (Math.abs((long)nums[j] - nums[i]) <= t) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {-2147483648,2147483647};
        int k = 1;
        int t = 1;
        System.out.println(containsNearbyAlmostDuplicate(nums, k, t));
    }
}
