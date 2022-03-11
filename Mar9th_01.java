package lanqiaodaka;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/03/09/7:45 AM
 * @Description: 要做耿沁园的男人
 */

import java.util.HashMap;

/**
 * 小明正看着 203879 这个数字发呆。
 * <p>
 * 原来，203879 * 203879 = 41566646641
 * <p>
 * 这有什么神奇呢？仔细观察，203879 是个 6 位数，并且它的每个数位上的数字都是不同的，并且它平方后的所有数位上都不出现组成它自身的数字。
 * <p>
 * 具有这样特点的 6 位数还有一个，请你找出它！
 * <p>
 * 再归纳一下筛选要求：
 * <p>
 * 6 位正整数；
 * 每个数位上的数字不同；
 * 其平方数的每个数位不含原数字的任何组成数位。
 */

public class Mar9th_01 {

  private static boolean isPingfangRepeat(long l, long i) {
    HashMap<Long, String> hashMap = new HashMap<>();
    while (i != 0) {
      hashMap.put(i % 10, "1");
      i /= 10;
    }
    while (l != 0) {
      if (hashMap.containsKey(l % 10)) {
        return true;
      }
      l /= 10;
    }
    return false;
  }

  private static boolean isSelfRepeat(long i) {
    HashMap<Long, String> hashMap = new HashMap<>();
    while (i != 0) {
      if (hashMap.containsKey(i % 10)) {
        return true;
      } else {
        hashMap.put(i % 10, "1");
      }
      i /= 10;
    }
    return false;
  }

  public static void main(String[] args) {
    for (long i = 10000; i <= 999999; i++) {
      if (isSelfRepeat(i)) {
        continue;
      } else if (isPingfangRepeat(i * i, i)) {
        continue;
      } else {
        System.out.println(i);
      }
    }
  }
}
