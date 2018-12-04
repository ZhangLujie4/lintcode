package 数组_字符串;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-04 18:41
 * @description 345
 */
public class ReverseVowel {

    public String reverseVowels(String s) {
        char[] sl = s.toCharArray();
        int first = 0;
        int last = sl.length-1;
        while(first<=last) {
            char x = sl[first];
            if (x != 'a' && x != 'e' && x != 'i' && x != 'o' && x != 'u'
                    && x != 'A' && x != 'E' && x != 'I' && x != 'O' && x != 'U') {
                first++;
                continue;
            }
            char y = sl[last];
            if (y != 'a' && y != 'e' && y != 'i' && y != 'o' && y != 'u'
                    && y != 'A' && y != 'E' && y != 'I' && y != 'O' && y != 'U') {
                last--;
                continue;
            }
            char temp = sl[first];
            sl[first] = sl[last];
            sl[last] = temp;
            first++;
            last--;
        }
        return String.valueOf(sl);
    }

    public static void main(String[] args) {

        System.out.println(new ReverseVowel().reverseVowels("aA"));
    }
}
