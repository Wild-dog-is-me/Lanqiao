package lanqiaodaka;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/03/10/8:11 AM
 * @Description: 要做耿沁园的男人
 */

/**
 * A,2,3,4,5,6,7,8,9 共 99 张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
 * 这样的排法可能会有很多。
 * 如果考虑旋转、镜像后相同的算同一种，
 * 一共有多少种不同的排法呢？
 */

public class Mar10th_02 {
  // 记录符合条件的组合个数
  private static int count = 0;

  public static void main(String[] args) {
    int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    dfs(c, 0);
    // 考虑旋转、镜像的情况
    System.out.println(count / 3 / 2);
  }

  // 进行交换
  public static void swap(int[] c, int i, int j) {
    int temp = c[i];
    c[i] = c[j];
    c[j] = temp;
  }

  public static void dfs(int[] c, int begin) {
    int len = c.length;
    // 递归的出口
    if (begin == len - 1) {
      int A = c[0] + c[1] + c[2] + c[3];
      int B = c[3] + c[4] + c[5] + c[6];
      int C = c[6] + c[7] + c[8] + c[9];
      if (A == B && B == C) {
        count++;
      }
      // 递归的过程
    } else {
      for (int i = begin; i < len; i++) {
        // 交换
        swap(c, begin, i);
        // 进行递归
        dfs(c, begin);
        // 回溯
        swap(c, begin, i);
      }
    }
  }
}
