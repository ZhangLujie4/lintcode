package 数组_字符串;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-03 09:42
 * @description 1 求数组中两数之和为某个值的组合
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (nums[i]+nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;
        for (int i : new TwoSum().twoSum(nums, 30)) {
            System.out.print(i + " ");
        }
    }
}
