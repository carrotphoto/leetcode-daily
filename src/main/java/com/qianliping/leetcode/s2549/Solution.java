package com.qianliping.leetcode.s2549;

/**
 * @author Qian Liping
 * @see <a href="https://leetcode.cn/problems/count-distinct-numbers-on-board/description/">2549.统计桌面上的不同数字</a>
 * @since 2024/3/23
 */
public class Solution {
    public int distinctIntegers(int n) {
        if (n == 1) {
            return 1;
        }
        return n - 1;
    }
}
