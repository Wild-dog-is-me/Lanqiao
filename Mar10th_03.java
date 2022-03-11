package lanqiaodaka;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/03/10/9:45 AM
 * @Description: 要做耿沁园的男人
 */

import java.util.Scanner;

/**
 * 今盒子里有 n 个小球，A、B 两人轮流从盒中取球，
 * 每个人都可以看到另一个人取了多少个，
 * 也可以看到盒中还剩下多少个，
 * 并且两人都很聪明，不会做出错误的判断。
 * 我们约定：
 * 每个人从盒子中取出的球的数目必须是：1，3，7 或者 8 个。
 * 轮到某一方取球时不能弃权！A 先取球，
 * 然后双方交替取球，直到取完。
 * 被迫拿到最后一个球的一方为负方（输方）
 * <p>
 * 输入描述：
 * 先是一个整数 n (n<100)，表示接下来有 n 个整数。
 * 然后是 n 个整数，每个占一行（整数< 10000
 * ），表示初始球数。
 * <p>
 * 请编程确定出在双方都不判断失误的情况下，对于特定的初始球数，A 是否能赢？
 * <p>
 * 输入描述
 * 先是一个整数 n\ (n<100)n (n<100)，表示接下来有 nn 个整数。
 * 然后是 nn 个整数，每个占一行（整数< 10^4104），表示初始球数。
 * <p>
 * 输出描述
 * 程序则输出 nn 行，表示 A 的输赢情况（输为 0，赢为 1）。
 */


public class Mar10th_03 {
  static int[] arr = new int[100];
  //	用arr1来存储当A取球时球数为1到8的情况，1代表赢，0代表输
  static int[] arr1 = {0, 1, 0, 1, 0, 1, 0, 1};

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //把arr1即前八种情况时A的输赢情况赋值为arr
    for (int i = 0; i < arr1.length; i++) {
      arr[i] = arr1[i];
    }
    //m表示输入的整数个数
    int m = sc.nextInt();
    int temp = 8;
    //逐个输入并判断
    for (int i = 0; i < m; i++) {
      int n = sc.nextInt();
      //当输入的整数小于等于temp时可以直接输出结果
      if (temp >= n) {
        System.out.println(arr[n - 1]);
      } else {
        //当输入整数大于temp时，我们可以从temp开始递加判断9,10,11以上的数，直到得到所要求的整数
        for (int j = temp; j < n; j++) {
          arr[j] = Aresult(j);
        }
        //最后将n赋值给temp,此时arr扩到temp-1种情况，下一个整数进入判断的时候就能更快的得到判断
        temp = n;
        System.out.println(arr[n - 1]);

      }
    }
  }

  public static int Aresult(int n) {
    if (arr[n - 1] == 0) {//这里==0时返回1的意思是A在此时要取值的地方，即在B可以赢的地方进行取值，下一步A就能进入自己能获得最优解的地方了
      return 1;
    }
    if (arr[n - 3] == 0) {
      return 1;
    }
    if (arr[n - 7] == 0) {
      return 1;
    }
    if (arr[n - 8] == 0) {
      return 1;
    }

    return 0;
  }
}
/**
 * 解题思路：我们可以知道由于两人都不会做出错误的判断，
 * 所以他们走的每一步都会让自己得到最优解，
 * 因为每个人从盒子中取出的球的数目必须是：1，3，7 或者 8 个，
 * 且A赢为1，输为0，我们可以知道，当最后A取球时只剩一个则A输，结果为0，
 * 只剩两个时A为1，只剩3个为0，
 * 以此类推当剩的球数从1到8时，A的胜负情况为0,1,0,1,0,1,0,1.
 * 所以我们先用数组arr1来储存这八种情况，另一个数组则存储输入的数，
 * 再创建一个方法来判断当输入大于8后的数最后得到的A的输赢情况
 */
