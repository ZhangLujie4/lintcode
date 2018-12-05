package 数组_字符串;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-04 21:49
 * @description 350
 */

/**
 * 这里及其牛逼
 */
public class InterSectionII {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }

        for (int i=0; i<nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int[] r = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            r[i] = result.get(i);
        }
        return r;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {1,1};
        int [] result = new InterSectionII().intersect(nums1, nums2);
        for (int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
