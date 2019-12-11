package leetcode.problems;


public class Reverse {

	/**
	 * 给出一个32位的有符号整数，将这个数字进行反转
	 * 123 -> 321
	 *
	 * @param x
	 * @return
	 */
	public static int reverse(int x) {
		int result = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
				return 0;
			}
			if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
				return 0;
			}
			result = result * 10 + pop;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
}
