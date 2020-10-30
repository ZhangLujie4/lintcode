package refresh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhanglujie
 * @since 2020-10-28 16:39
 */
public class LeetCode451 {

    // todo 通过大顶堆实现频率降序
    public static String frequencySort(String s) {
        Map<Character, Integer> frequencySortMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            Integer result = frequencySortMap.getOrDefault(temp, 0);
            frequencySortMap.put(temp, result + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(frequencySortMap.entrySet());
        Collections.sort(list, (o1, o2) -> -o1.getValue().compareTo(o2.getValue()));
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Character, Integer> frequency : list) {
            for (int i = 0; i < frequency.getValue(); i++) {
                stringBuilder.append(frequency.getKey());
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("Aabb"));
    }
}
