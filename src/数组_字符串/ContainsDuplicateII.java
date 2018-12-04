package 数组_字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-04 14:47
 * @description 219
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int step = Integer.MAX_VALUE;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            Integer x = map.get(nums[i]);
            if (x == null) {
                map.put(nums[i], i);
            } else {
                map.put(nums[i], i);
                if (step > (i-x)) {
                    step = i-x;
                }
            }
        }
        return step<=k?true:false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        System.out.println(new ContainsDuplicateII().containsNearbyDuplicate(nums, 3));
    }
}
