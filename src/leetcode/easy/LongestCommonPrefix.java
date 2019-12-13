package leetcode.easy;


public class LongestCommonPrefix {

    /**
     * 长公共前
     * @param strs ["flower","flow","flight"]
     * @return "fl"
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(str) != 0) {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("flow".indexOf("flower"));
    }
}
