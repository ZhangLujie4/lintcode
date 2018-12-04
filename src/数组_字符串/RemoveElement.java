package 数组_字符串;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-04 17:27
 * @description 27
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        int len = new RemoveElement().removeElement(nums, 2);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
