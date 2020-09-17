package china;

/**
 * 回文字符串
 * @author zhanglujie
 * @since 2020-08-19 19:00
 */
public class Problem647 {

    public int countSubstrings(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String before = s.substring(i, j + 1);
                if (before.equals(new StringBuffer(before).reverse().toString())) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Problem647().countSubstrings("abbac"));
    }
}
