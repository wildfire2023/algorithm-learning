package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * author : wildfire
 * date : 2022/9/11 11:49
 * description : 通过递归+回溯解决
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        // 右指针
        int rk = -1, ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                // 左指针向右移动一格
                occ.remove(s.charAt(i - 1));
            }
            // 右指针不断向右扩
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
