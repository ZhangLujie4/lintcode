package refresh;

/**
 * @author zhanglujie
 * @since 2020-10-30 14:41
 */
public class LeetCode209 {

    // todo 队列 or 窗口
    // 这里我要用队列
    public static int minSubArrayLen(int s, int[] nums) {
        int head = 0;
        int sum = 0;
        int tail = 0;
        int min = Integer.MAX_VALUE;
        while (head < nums.length) {
            sum += nums[head++];
            while (sum >= s) {
                min = Math.min(min, head - tail);
                sum -= nums[tail++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int s = 7;
        System.out.println(minSubArrayLen(s, nums));
    }
}
