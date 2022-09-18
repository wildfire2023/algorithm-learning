package leetcode.easy;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        // <1> 异或
        x ^= y;
        int count = 0;
        while (x != 0) {
            count++;
            x &= (x - 1);
        }
        return count;
    }
}
