package leetcode.easy;

import java.sql.SQLOutput;

public class StrStr {

    public static int strStr(String haystack, String needle) {
        if ("".equals(needle)) return 0;
        char[] haystackC = haystack.toCharArray();
        char[] needleC = needle.toCharArray();
        int pos = 0;
        int posj = 0;
        while (pos < haystackC.length && posj < needleC.length) {
            if (haystackC[pos] != needleC[posj]) {
                pos = pos - (posj - 1);
                posj = 0;
            } else {
                pos++;
                posj++;
            }
        }
        return posj == needleC.length ? pos - posj : -1;
    }


    public static void main(String[] args) {
        System.out.println(strStr("hello", "lo"));
    }
}
