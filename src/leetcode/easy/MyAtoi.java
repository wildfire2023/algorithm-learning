package leetcode.easy;

public class MyAtoi {


    public static int myAtoi(String s) {
        // 顶格注释
        char[] inputChars = s.toCharArray();

        // 非块头部，换行注释
        int length = inputChars.length;
        int index = 0;
        while (index < length && inputChars[index] == ' ') {
            index++;
        }
        if (index >= length) {
            return 0;
        }

        // 判断符号
        int sign = 1;
        if (inputChars[index] == '-' || inputChars[index] == '+') {
            if (inputChars[index] == '-') {
                sign = -1;
            }
            index++;
        }
        int result = 0;
        int temp = 0;

        // 无歧义注释
        while (index < length) {
            int num = inputChars[index] - '0';
            if (num > 9 || num < 0) { // if行内注释
                break;
            }
            temp = result;
            result = result * 10 + num;
            if (result / 10 != temp) { // 越界判断
                if (sign > 0) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            index++;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("words and 987"));

    }
}
