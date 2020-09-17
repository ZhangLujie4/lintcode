package jdk8;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @author zhanglujie
 * @since 2020-08-20 16:54
 */
public class JDK8Test {

    interface Converter<F, T> {
        T convert(F from);
    }

    class Something {
        String startsWith(String s) {
            return String.valueOf(s.charAt(0));
        }
    }

    public static void main(String[] args) {
        Something something = new JDK8Test().new Something();
        Converter<String, String> converter = something::startsWith;
        String converted = converter.convert("Java");
        System.out.println(converted);

        Predicate<String> predicate = (s) -> s.length() > 0;
        predicate.test("foo");
        predicate.negate().test("foo");

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        int n = 0;
        label1:
            while (n++ < 10) {
                int j = 0;
                while (j++ < 10) {
                    if (j == 2) {
                        System.out.println(j + " " + n);
                        // break label1;
                        break;
                    }
                }
            }
    }
}
