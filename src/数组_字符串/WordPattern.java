package 数组_字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-04 17:45
 * @description
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        String[] p = pattern.split("");
        String[] s = str.split(" ");
        Map<String, Integer> mp = new HashMap<>();
        Map<String, Integer> sp = new HashMap<>();
        if (pattern.length() != s.length) {
            return false;
        }
        for (int i=0; i<pattern.length(); i++) {
            mp.put(p[i], i);
            sp.put(s[i], i);
        }
        for (int i=0; i<pattern.length(); i++) {
            if (!mp.get(p[i]).equals(sp.get(s[i]))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(new WordPattern().wordPattern("", "beef"));
    }
}
