package leetcode.medium;


public class MaxPalindromeString {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbbbacccas"));
    }

    /**
     * String.charAt每次都会检查数组下标
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) return s;
        int maxLen = 1;
        int begin = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxLen && validPalindromic(chars, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    public static String longestPalindromme(String s ) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i+1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }

        }
        return s.substring(start, end + 1);
        
    }

    /**
     * 中心扩散
     * @param s
     * @param left
     * @param right
     * @return
     */
    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;
    }




    /**
     * 校验是否回文串
     * @param chars
     * @param left
     * @param right
     * @return
     */
    public static boolean validPalindromic(char[] chars, int left, int right) {
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
