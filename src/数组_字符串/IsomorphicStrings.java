package 数组_字符串;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-03 17:49
 * @description 205
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        String[] sList = s.split("");
        String[] tList = t.split("");
        for (int i=0; i<s.length(); i++) {
            if (s.indexOf(sList[i]) != t.indexOf(tList[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsomorphicStrings().isIsomorphic("foo", "bar"));
        System.out.println(new IsomorphicStrings().isIsomorphic("egg", "add"));
        System.out.println(new IsomorphicStrings().isIsomorphic("paper", "title"));
    }
}
