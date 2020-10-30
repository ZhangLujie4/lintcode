package refresh;

/**
 * @author zhanglujie
 * @since 2020-10-26 19:42
 */
public class LeetCode150 {

    public static int evalRPN(String[] tokens) {
        String[] temp = new String[tokens.length];
        int lastIndex = 0;

        for (int i=0; i < tokens.length; i++) {
            int index = "+-*/".indexOf(tokens[i]);
            if (index >= 0) {
                int tempInt;
                if (index == 0) {
                    tempInt = Integer.valueOf(temp[lastIndex - 2]) + Integer.valueOf(temp[lastIndex - 1]);
                } else if (index == 1) {
                    tempInt = Integer.valueOf(temp[lastIndex - 2]) - Integer.valueOf(temp[lastIndex - 1]);
                } else if (index == 2) {
                    tempInt = Integer.valueOf(temp[lastIndex - 2]) * Integer.valueOf(temp[lastIndex - 1]);
                } else {
                    tempInt = Integer.valueOf(temp[lastIndex - 2]) / Integer.valueOf(temp[lastIndex - 1]);
                }

                lastIndex -= 2;
                temp[lastIndex++] = tempInt + "";
            } else {
                temp[lastIndex++] = tokens[i];
            }
        }
        return Integer.valueOf(temp[0]);
    }

    //纯数组模拟栈实现(推荐)   3 ms	36 MB
    public static int evalRPN2(String[] tokens) {
        int[] numStack = new int[tokens.length / 2 + 1];
        int index = 0;
        for (String s : tokens) {
            switch (s) {
                case "+":
                    numStack[index - 2] += numStack[--index];
                    break;
                case "-":
                    numStack[index - 2] -= numStack[--index];
                    break;
                case "*":
                    numStack[index - 2] *= numStack[--index];
                    break;
                case "/":
                    numStack[index - 2] /= numStack[--index];
                    break;
                default:
                    // numStack[index++] = Integer.valueOf(s);
                    //valueOf改为parseInt，减少自动拆箱装箱操作
                    numStack[index++] = Integer.parseInt(s);
                    break;
            }
        }
        return numStack[0];
    }

    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(tokens));
    }
}
