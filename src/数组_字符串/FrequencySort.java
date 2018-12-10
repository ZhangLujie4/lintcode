package 数组_字符串;

import java.util.*;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-05 09:21
 * @description
 */
public class FrequencySort {

    public String frequencySort(String s) {
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] sl = s.split("");
        for (int i=0; i<sl.length; i++) {
            if (map.containsKey(sl[i])) {
                map.put(sl[i], map.get(sl[i]) + 1);
            } else {
                map.put(sl[i], 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue()<=0?1:-1;

            }
        });
        StringBuffer result = new StringBuffer();
        for (int i=0; i<list.size(); i++) {
            int x = list.get(i).getValue();
            while (--x >= 0) {
                result.append(list.get(i).getKey());
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new FrequencySort().frequencySort("tree"));
    }
}
