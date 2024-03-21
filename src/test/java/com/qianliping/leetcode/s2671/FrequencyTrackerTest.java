package com.qianliping.leetcode.s2671;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Qian Liping
 * @since 2024/3/21
 */
class FrequencyTrackerTest {

    @Test
    void testCase_01() {
        FrequencyTracker frequencyTracker = new FrequencyTracker();
        frequencyTracker.add(3);
        frequencyTracker.add(3);
        boolean value = frequencyTracker.hasFrequency(2);

        assertTrue(value);

    }

    @Test
    void testCase_02() {
        FrequencyTracker frequencyTracker = new FrequencyTracker();
        frequencyTracker.add(1);
        frequencyTracker.deleteOne(1);
        boolean value = frequencyTracker.hasFrequency(1);

        assertFalse(value);
    }

    @Test
    void testCase_03() {
        FrequencyTracker frequencyTracker = new FrequencyTracker();
        boolean value = frequencyTracker.hasFrequency(2);
        assertFalse(value);
        frequencyTracker.add(3);
        value = frequencyTracker.hasFrequency(1);
        assertTrue(value);
    }

}