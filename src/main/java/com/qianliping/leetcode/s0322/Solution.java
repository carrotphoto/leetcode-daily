package com.qianliping.leetcode.s0322;

import java.util.Arrays;

/**
 * @author Qian Liping
 * @see <a href="https://leetcode.cn/problems/coin-change/">322.零钱兑换</a>
 * @since 2024/3/24
 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] sorted = Arrays.stream(coins).distinct().sorted().toArray();
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : sorted) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
