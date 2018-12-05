package 数组_字符串;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-04 21:16
 * @description 349
 */
public class InterSection {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int j=nums2.length-1; j>-1; j--) {
            for (int i=nums1.length-1; i>-1; i--) {
                if (nums1[i] == nums2[j]) {
                    result.add(nums1[i]);
                    break;
                }
            }
        }
        int[] output = new int[result.size()];
        int j=result.size();
        for (Integer i : result) {
            output[--j] = i;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int [] result = new InterSection().intersection(nums1, nums2);
        for (int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
