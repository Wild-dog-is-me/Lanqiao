package lanqiaodaka;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/03/07/11:26 AM
 * @Description: 要做耿沁园的男人
 */

/**
 * 如果一个正整数只有 11 和它本身两个约数，则称为一个质数（又称素数）。
 * 前几个质数是：2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, · · ·
 * 如果一个质数的所有十进制数位都是质数，我们称它为纯质数。
 * 例如：2,3, 5, 7, 23, 37 都是纯质数，
 * 而 11, 13, 17, 19, 29, 31 不是纯质数。
 * 当然 1, 4, 35 也不是纯质数。
 * 请问，在 1 到 20210605 中，有多少个纯质数？
 */

public class Mar8th_01A {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i < 20210605; i++) {
      if (isPrime(i) && fun(i)) {
        sum++;
      }
    }
    System.out.println(sum);
  }

  public static boolean isPrime(int num) {
    if (num == 1 || num == 0) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean fun(int n) {
    while (n > 0) {
      int a = n % 10;
      if (!isPrime(n)) {
        return false;
      }
      a = a / 10;
    }
    return false;
  }
}
