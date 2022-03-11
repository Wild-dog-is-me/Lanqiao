package lanqiaodaka;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/03/10/6:51 AM
 * @Description: 要做耿沁园的男人
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 2020 年春节期间，有一个特殊的日期引起了大家的注意：2020 年 2 月 2 日。因为如果将这个日期按 “yyyymmdd” 的格式写成一个 8 位数是 20200202，恰好是一个回文数。我们称这样的日期是回文日期。
 * 有人表示 20200202 是 “千年一遇” 的特殊日子。对此小明很不认同，因为不到 2 年之后就是下一个回文日期：20211202 即 2021 年 12 月 2 日。
 * 也有人表示 20200202 并不仅仅是一个回文日期，还是一个 ABABBABA 型的回文日期。对此小明也不认同，因为大约 100 年后就能遇到下一个 ABABBABA 型的回文日期：21211212 即 2121 年 12 月 12 日。算不上 “千年一遇”，顶多算 “千年两遇”。
 * 给定一个 8 位数的日期，请你计算该日期之后下一个回文日期和下一个 ABABBABA 型的回文日期各是哪一天。
 * 输入描述
 * 输入包含一个八位整数 N，表示日期。
 * 对于所有评测用例，10000101≤N≤89991231，保证 N 是一个合法日期的 8 位数表示。
 * 输出描述
 * 输出两行，每行 1 个八位数。第一行表示下一个回文日期，第二行表示下一个 ABABBABA 型的回文日期。
 * 输入输出样例
 * 示例
 * 输入
 * 20200202
 * 输出
 * 20211202
 * 21211212
 */

public class Mar9th_03 {
  public static void main(String[] args) {
    boolean flag = true;
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int year = Integer.parseInt(str.substring(0, 4));
    int month = Integer.parseInt(str.substring(4, 6));
    int day = Integer.parseInt(str.substring(6, 8));
    Calendar c1 = Calendar.getInstance();
    c1.set(year, month, day);
    while (true) {
      c1.add(Calendar.DATE, 1);
      String ndate = new SimpleDateFormat("yyyy-MM-dd").format(c1.getTime());
      if (check1(ndate.toCharArray()) && flag) {
        System.out.println(ndate);
        flag = false;
      }

      if (check2(ndate.toCharArray())) {
        System.out.println(ndate);
        break;
      }
    }
  }

  public static boolean check1(char[] str) {
    for (int i = 0; i < str.length / 2; i++) {
      if (str[i] != str[str.length - i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static boolean check2(char[] str) {
    char A = str[0];
    char B = str[1];
    if (str[2] != A || str[3] != B || str[4] != B ||
      str[5] != A || str[6] != B || str[7] != A) return false;
    return true;
  }
}
