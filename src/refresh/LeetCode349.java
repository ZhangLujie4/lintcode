package refresh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author zhanglujie
 * @since 2020-10-28 17:08
 */
public class LeetCode349 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = nums1.length;
        int j = nums2.length;
        while (--i >= 0) {
            Integer num = map.get(nums1[i]);
            if (num == null) {
                map.put(nums1[i], 1);
            }
        }
        Set<Integer> result = new HashSet<>();
        while (--j >= 0) {
            if (map.containsKey(nums2[j])) {
                result.add(nums2[j]);
            }
        }

        int k = result.size();
        int[] res = new int[k];
        for (int num : result) {
            res[++j] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] result = intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        for (int i : result) {
            System.out.printf(i + " ");
        }
        System.out.println();
    }
}
