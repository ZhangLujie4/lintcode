package 数组_字符串;

import java.util.*;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-04 18:59
 * @description 347
 */
public class TopKFrequence {

    public List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i=0; i<nums.length; i++) {
            Integer x = map.get(nums[i]);
            if (null == x) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], x+1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });
        for (int i=0; i<k; i++) {
            result.add(list.get(i).getKey());
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};
        List<Integer> result = new TopKFrequence().topKFrequent(nums, 2);
        for (int i=0; i<2; i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
