package 数组_字符串;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-03 09:54
 * @description 11 求坐标组成的最大面积
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                int result = (j-i)*(height[j]>height[i]?height[i]:height[j]);
                if (result>max) {
                    max = result;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(new ContainerWithMostWater().maxArea(height));
    }
}
