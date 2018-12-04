package 数组_字符串;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-04 17:36
 * @description 283
 */

public class MoveZeros {

    public void moveZeroes(int[] nums) {

        int j = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (; j<nums.length; j++) {
            nums[j] = 0;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        new MoveZeros().moveZeroes(nums);
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
