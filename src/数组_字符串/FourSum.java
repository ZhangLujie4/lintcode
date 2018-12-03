package 数组_字符串;

import java.util.*;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-03 17:32
 * @description
 */
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i=0; i<nums.length-3; i++) {
            for (int j=i+1; j<nums.length-2; j++) {
                int k = j+1;
                int l = nums.length-1;
                while (k<l) {
                    int sum = nums[i]+nums[j]+nums[k]+nums[l];
                    if (sum == target) {result.add(Arrays.asList(nums[i],nums[j],nums[k++],nums[l--]));}
                    if (sum > target) {l--;}
                    if (sum < target) {k++;}
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 0, -1, 0, -2, 2};
        System.out.println(new FourSum().fourSum(numbers, 0).toString());
    }
}
