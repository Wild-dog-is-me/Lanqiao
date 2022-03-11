package lanqiaodaka;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/03/10/7:39 AM
 * @Description: 要做耿沁园的男人
 */

/**
 * 小明和他的表弟一起去看电影，有人问他们的年龄。
 * 小明说：今年是我们的幸运年啊。
 * 我出生年份的四位数字加起来刚好是我的年龄。
 * 表弟的也是如此。已知今年是2014年，
 * 并且，小明说的年龄指的是周岁。
 * 请推断并填写出小明的出生年份。
 */

public class Mar10th_01A {
  public static void main(String[] args) {
    for (int i = 1980; i < 2014; i++) {
      int num = Sum(i);
      if (num == 2014 - i) {
        System.out.println(i);
        break;
      }
    }
  }

  public static int Sum(int year) {
    int g = year % 10;
    int s = year / 10 % 10;
    int b = year / 100 % 10;
    int q = year / 1000 % 10;
    return g + s + b + q;
  }
}
