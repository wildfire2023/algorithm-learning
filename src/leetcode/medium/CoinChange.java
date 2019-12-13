package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 零钱兑换
 */
public class CoinCharge {


    /**
     * 暴力解法
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int num = Integer.MAX_VALUE;
        for (int coin : coins) {
            // 金额不可达
            if (amount - coin < 0) continue;
            int subProb = coinChange(coins, amount - coin);
            // 子问题无解
            if (subProb == -1) continue;
            num = Math.min(num, subProb + 1);
        }
        return num == Integer.MAX_VALUE ? -1 : num;
    }

    public int coinChange1(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo ,-2);
        return helper(coins, amount, memo);
    }

    public int helper(int[] coins, int amount, int[] memo) {
        // 递归结束
        if (amount == 0) return 0;
        // 已在备忘录中存在当前amount最小值
        if (memo[amount] != -2) return memo[amount];
        int num = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (amount - coin < 0) continue;
            int subProb = helper(coins, amount - coin, memo);
            if (subProb == -1) continue;
            num = Math.min(num, subProb + 1);
        }
        memo[amount] = (num == Integer.MAX_VALUE) ? -1 : num;
        return memo[amount];
    }


    public int coinChange2(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                if (i - coin < 0) continue;
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return (dp[amount] == amount + 1) ? -1 :dp[amount];
    }


    public static void main(String[] args) {

    }
}
