package lanqiaodaka;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/03/09/10:53 AM
 * @Description: 要做耿沁园的男人
 */

import java.util.Scanner;

/**
 * 小明开了一家糖果店。他别出心裁：把水果糖包成 4 颗一包和 7 颗一包的两种。糖果不能拆包卖。
 * <p>
 * 小朋友来买糖的时候，他就用这两种包装来组合。当然有些糖果数目是无法组合出来的，比如要买 10 颗糖。
 * <p>
 * 你可以用计算机测试一下，在这种包装情况下，最大不能买到的数量是 17。大于 17 的任何数字都可以用 4 和 7 组合出来。
 * <p>
 * 本题的要求就是在已知两个包装的数量时，求最大不能组合出的数字。
 * <p>
 * 输入描述
 * 输入两个正整数，表示每种包装中糖的颗数(都不多于 1000 )。
 * 输出描述
 * 输出一个正整数，表示最大不能买到的糖数。
 * 不需要考虑无解的情况
 */
// 数论解法
public class Mar9th_02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(a*b -a-b);
  }
}
