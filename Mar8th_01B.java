package lanqiaodaka;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/03/08/7:22 PM
 * @Description: 要做耿沁园的男人
 */

public class Mar8th_01B {
  public static void main(String[] args) {
    int s = 2; // s = 2是因为 2和3都是质数，直接从4开始计算
    int y;
    int t;
    for (int k = 4; k <= 20210605; k++) {
      t = 0;
      y = k;
      while (y > 0) {
        if (y % 10 == 0 || y % 10 == 1 || y % 10 == 4 || y % 10 == 6 || y % 10 == 8 || y % 10 == 9) {
          t = 1;
          break; // 包含0、1、4、6、8、9非质数元素
        }
        else {
          y /= 10;
        }
      }
      if (t == 0) {
        for (int j = 2; j <= Math.sqrt(k); j++) {
          if (k % j == 0) {  // 判断是否有约数，若有约数，则为非质数
            break;
          }
          if (j + 1 > Math.sqrt(k)) { // 判断到最后一个还没有约数，说明这个数是质数
            s++;
          }
        }
      }
    }
    System.out.println(s);
  }
}
