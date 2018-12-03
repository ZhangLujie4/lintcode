package 数组_字符串;

import java.util.*;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-03 13:33
 * @description
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i=0; i<n-2; i++) {
            int j = i+1;
            int k = nums.length-1;
            while(j<k) {
                int sum = nums[i]+nums[j]+nums[k];
                /**
                 * 后面从前往后的j,从后往前的k
                 */
                if (sum == 0) {res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));}
                else if (sum > 0) {k--;}
                else if (sum < 0) {j++;}
            }
        }
        return new ArrayList<>(res);
    }

    public static void main(String[] args) {

        int[]nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(new ThreeSum().threeSum(nums).toString());
    }
}
