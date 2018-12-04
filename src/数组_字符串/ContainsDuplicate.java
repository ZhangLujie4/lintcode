package 数组_字符串;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-04 14:25
 * @description 217
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for (int x : nums) {
            result.add(x);
        }
        return result.size()!=nums.length?true:false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(new ContainsDuplicate().containsDuplicate(nums));
    }
}
