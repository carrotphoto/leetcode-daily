package com.qianliping.leetcode.s0322;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Qian Liping
 * @since 2024/3/24
 */
class SolutionTest {

    @Test
    void case_01() {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        int result = new Solution().coinChange(coins, amount);
        assertEquals(3, result);
    }

    @Test
    void case_02() {
        int[] coins = new int[]{2};
        int amount = 3;
        int result = new Solution().coinChange(coins, amount);
        assertEquals(-1, result);
    }

    @Test
    void case_03() {
        int[] coins = new int[]{1};
        int amount = 0;
        int result = new Solution().coinChange(coins, amount);
        assertEquals(0, result);
    }
}