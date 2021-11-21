package leetcode.easy;

public class HammingWeight {

    /**
     * 一个整数与上它减一的数
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n &= n-1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(4 & 1);
    }
}
