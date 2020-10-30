package refresh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhanglujie
 * @since 2020-10-28 17:41
 */
public class LeetCode350 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            int temp = map.getOrDefault(num, 0);
            map.put(num, temp + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            int temp = map.getOrDefault(num, 0);
            if (temp > 0) {
                list.add(num);
                map.put(num, temp - 1);
            }
        }
        int[] result = new int[list.size()];
        int i = 0;
        for (Integer num : list) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
