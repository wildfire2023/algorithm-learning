package leetcode.problems;

public class IsPalindrome {

	/**
	 * 判断一个数是否是回文数
	 * @param x
	 * @return
	 */
	public static boolean isPalindrome(int x) {
		int before = x;
		int after = 0;
		while (x != 0) {
			after = 10 * after + (x % 10);
			x = x / 10;
		}
		return before == after;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}
}
