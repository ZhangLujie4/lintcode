package 数组_字符串;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-04 17:12
 * @description 26
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int result = 1;
        int index = 1;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[index++] = nums[i+1];
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums = {1};
        int len = new RemoveDuplicates().removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
