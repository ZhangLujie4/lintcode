package 数组_字符串;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-04 17:02
 * @description 242
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        if (s.length() != t.length()) {
            return false;
        }
        for (int i=0; i<s.length(); i++) {
            if (s1[i] != t1[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(new ValidAnagram().isAnagram("anagram", "nagaram"));
        System.out.println(new ValidAnagram().isAnagram("rat", "cat"));
    }
}
