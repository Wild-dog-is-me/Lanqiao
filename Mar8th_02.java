package lanqiaodaka;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/03/08/6:21 PM
 * @Description: 要做耿沁园的男人
 */

import java.util.Scanner;

/**
 * 你有一架天平。现在你要设计一套砝码，使得利用这些砝码可以称出任意 小于等于 N 的正整数重量。
 * 那么这套砝码最少需要包含多少个砝码？
 * 注意砝码可以放在天平两边。
 * 输入格式
 * 输入包含一个正整数 N。
 * 输出格式
 * 输出一个整数代表答案。
 * 样例输入
 * 7
 * copy
 * 样例输出
 * 3
 * copy
 * 样例说明
 * 3 个砝码重量是 1、4、6可以称出 11 至 77的所有重量。
 * <p>
 * 1 = 1；
 * 2 = 6 − 4(天平一边放 6，另一边放 4)；
 * <p>
 * 3 = 4 − 1；
 * 4 = 4；
 * 5 = 6 − 1；
 * 6 = 6；
 * 7 = 1 + 6；
 * 少于 3 个砝码不可能称出 1 至 7 的所有重量。
 */

public class Mar8th_02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 1;
    int weight = 1;
    int total = 1;
    while (total < n) {
      count++;
      weight *= 3;
      total += weight;
    }
    System.out.println(count);
  }
}

/**
 * 结果应该是最少的砝码数量
 * 首先，如果要称的重量为1的话，只能选择重量为1的砝码，1是必选的一个砝码。
 *
 * 然后再称比1重的，反正都是要再加砝码，那我们为何不选一个能称的重量尽可能大的呢。
 * 选1、2的砝码可以满足1=1，2=2，1+2=3
 * 选1、3的砝码可以满足1=1，2=3-1，3=3，4=3+1
 * 选1、4的砝码可以满足1=1，2=？无法称2，不合题意
 * 因此我们选择的砝码组合是1、3，此时我们可以称的最大重量为4
 *
 * 当我们还需要再增加砝码时
 * 同理可得
 * 选1、3、9的组合可以满足小于等于13（13=1+3+9）的所有重量
 *
 * 从中可以发现一个规律，当我们需要第三个砝码是，前两个砝码（1、3）满足的最大重量已经是4了，
 * 下一个要满足的重量是5，我们遵循砝码尽可能大的原则，选择的第三个砝码的重量满足的条件是：
 * 它减去 已经可以称得的最大重量 可以得到 下一个需要称的重量。也就是weight - 4 = 5，可得weight为9
 *
 * count            weight             total
 * __________________________________________________________
 * 1                1                  1
 * 2                3                  4
 * 3                9                  13
 * ___________________________________________________________
 * count = count+1  weight = weight*3  total = total + weight
 */