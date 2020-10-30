package refresh;

/**
 * @author zhanglujie
 * @since 2020-10-30 15:28
 */
public class LeetCode283 {

    // 这个恶心的实现方法，边界值真的是够了
    public static void moveZeroes(int[] nums) {
        int index0 = -1;
        int indexN = 0;
        while (indexN < nums.length) {

            if (nums[indexN] != 0) {
                if (index0 >= 0) {
                    nums[index0] = nums[indexN];
                    nums[indexN] = 0;

                    while (index0 < nums.length) {
                        if (nums[index0] != 0) {
                            index0++;
                        } else {
                            break;
                        }
                    }
                }
            } else if (index0 == -1) {
                index0 = indexN;
            }

            indexN++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 2, 1};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + ",");
        }

    }
}
