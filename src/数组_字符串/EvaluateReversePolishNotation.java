package 数组_字符串;

import java.util.Stack;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-03 16:20
 * @description
 */

/**
 * 这个不就是栈么
 */
public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        int a = 0;
        int b = 0;
        Stack<Integer> st = new Stack<>();
        for (int i=0; i<tokens.length; i++) {
            String x = tokens[i];
            if (x.equals("*") || x.equals("+") || x.equals("-") || x.equals("/")) {
                a = st.pop();
                b = st.pop();
                if (x.equals("+")) {
                    st.push(b + a);
                    continue;
                }
                if (x.equals("-")) {
                    st.push(b - a);
                    continue;
                }
                if (x.equals("/")) {
                    st.push(b / a);
                    continue;
                }
                if (x.equals("*")) {
                    st.push(b * a);
                    continue;
                }
            }
            st.push(Integer.parseInt(x));
        }
        return st.pop();
    }

    public static void main(String[] args) {

        String[] begin = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(new EvaluateReversePolishNotation().evalRPN(begin));
    }
}
