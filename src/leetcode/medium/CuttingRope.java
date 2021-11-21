package leetcode.medium;

public class CuttingRope {


    /**
     * 长度为n的绳子剪成m段，m段乘积最大
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        if(n < 2) return 0;
        if(n == 2) return 1;
        if (n == 3) return 2;

        int[] products = new int[n + 1];
        int max = 0;
        for(int i = 4; i <= n; i++) {
            max = 0;
            for(int j = 1; j <= i / 2; j++) {
                int product = products[j] * products[i - j];
                if (max < product) max = product;
                products[i] = max;
            }
        }
        max = products[n];
        return max;
    }


//    public int cutting


}
