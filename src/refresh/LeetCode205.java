package refresh;

import java.util.HashMap;

/**
 * @author zhanglujie
 * @since 2020-10-28 19:12
 */
public class LeetCode205 {

    // 通过映射解决问题，tql
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (map.get(sc) == null) {
                if (map.containsValue(tc)) {
                    return false;
                }
                map.put(sc, tc);
            } else if (map.get(sc) != tc) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
    }
}
