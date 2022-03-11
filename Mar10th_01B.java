package lanqiaodaka;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/03/10/10:40 PM
 * @Description: 要做耿沁园的男人
 */

public class Mar10th_01B {
  public static void main(String[] args) {
    int res = 0;
    int count = 0;
    for (int i = 2014; i > 0; i--) {
      int ans = quickYear(2014 - i);
      if (ans == 2014 - i) {
        res = i;
        count += 1;
//				当取到第二个幸运年的时候返回结果，即count==2，因为小明还有一个比他小的表弟
//				可能还有人会好奇为什么是第二幸运年的时候返回，那第三个，第四个呢？
//				这里我们可以测试一下，从2014到0就只有两个年份符合幸运年的条件
        if (count == 2) {
          System.out.println(res);
          break;
        }
      }
    }
  }

  public static int quickYear(int num) {
    int sum = 0;
    while (num > 0) {
      int temp = num % 10;
      sum += temp;
      num /= 10;
    }
    return sum;
  }
}
