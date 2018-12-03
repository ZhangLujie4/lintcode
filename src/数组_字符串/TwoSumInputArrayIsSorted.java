package 数组_字符串;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-03 17:16
 * @description 167 以排序数组的，两数之和为某个值
 */

public class TwoSumInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int n = numbers.length;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i+1;
                    result[1] = j+1;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] begin = {2, 7, 11, 15};
        for (int x : new TwoSumInputArrayIsSorted().twoSum(begin, 9)) {
            System.out.print(x + " ");
        }
    }
}
