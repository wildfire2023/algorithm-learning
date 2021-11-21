package leetcode.medium;

public class MyPow {

    public static double myPow(double x, int n) {
        double result = 1D;
        if (n == 0) return 1;
        if (x == 0) return 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result *= x;
            }
        } else if (n < 0) {
            int N = -n;
            for (int i = 1; i <= N; i++) {
                result *= x;
            }
            result = 1 / N;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 9;
        int[] res1 = new int[n + 1];
        // n = 87
        StringBuilder res = new StringBuilder().append(n);
        while (n > 1) {
            n -= 1;
            res.append(" ").append(n);
        }
        String[] res2 = res.toString().split(" ");
        for (int i = res2.length - 1; i >= 0; i--) {
            res1[i] = Integer.parseInt(res2[i]);
        }

    }
}
