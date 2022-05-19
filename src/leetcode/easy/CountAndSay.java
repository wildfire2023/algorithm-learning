package leetcode.easy;

import java.util.Arrays;

/**
 * 外观数列
 * 题目有点秀:
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *
 */
public class CountAndSay {

    /**
     * 对每一项的操作需要知道上一项
     * @param n
     * @return
     */
    public static String countAndSay(int n) {
        String[] dp = new String[n + 1];
        Arrays.fill(dp, "1");
        for (int i = 1; i < dp.length - 1; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char[] numberChars = dp[i].toCharArray();
            for (int j = 0; j < numberChars.length; j++) {
                if (j + 1 < numberChars.length && numberChars[j + 1] == numberChars[j]) {
                    count++;
                } else {
                    sb.append(count).append(numberChars[j]);
                    count = 1;
                }
            }
            dp[i + 1] = sb.toString();
        }
        return dp[n];
    }


    /**
     * 使用递归
     *
     * @param n
     * @return
     */
    public static String countAndSay2(int n) {
        if (n == 1) {
            return "1";
        }

        // 获取上一项的外观字符串
        String s1 = countAndSay2(n - 1);
        StringBuilder sb = new StringBuilder();

        // 计数器
        int count = 0;
        char lastChar = s1.charAt(0);
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == lastChar) { // 计算同一个数字出现的次数
                count++;
            } else {
                // 记录
                sb.append(count);
                sb.append(lastChar);
                count = 1;
                lastChar = s1.charAt(i);
            }
        }
        sb.append(count);
        sb.append(lastChar);
        return sb.toString();


    }


    public static void main(String[] args) {
        System.out.println(countAndSay(30));
    }
}
