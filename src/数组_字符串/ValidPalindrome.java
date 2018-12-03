package 数组_字符串;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-03 10:03
 * @description
 */

/**
 * 有效回文，跳过除字符串和数字以外的字符，不区分大小写
 */

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        char[] words = s.toLowerCase().toCharArray();
        int first = 0;
        int last = words.length-1;
        while (first <= last) {
            char x = words[first];
            if (!((x <= 'z' && x >= 'a') || (x <= '9' && x >= '0'))) {
                first++;
                continue;
            }
            char y = words[last];
            if (!((y <= 'z' && y >= 'a') || (y <= '9' && y >= '0'))) {
                last--;
                continue;
            }
            if (words[first] != words[last]) {
                return false;
            }
            first++;
            last--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new ValidPalindrome().isPalindrome("race a car"));
        System.out.println(new ValidPalindrome().isPalindrome(""));
    }
}
