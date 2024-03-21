package com.qianliping.leetcode.s2671;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Qian Liping
 * @since 2024/03/21
 */
class FrequencyTracker {

    Map<Integer, Integer> numToFrequency = new HashMap<>();
    Map<Integer, Integer> frequencyToNumCount = new HashMap<>();

    public FrequencyTracker() {

    }

    public void add(int number) {
        int frequency = numToFrequency.getOrDefault(number, 0);
        int nextFrequency = frequency + 1;

        numToFrequency.put(number, nextFrequency);

        Integer oldNumCount = frequencyToNumCount.get(frequency);
        Integer numCount = frequencyToNumCount.get(nextFrequency);

        if (oldNumCount != null) {
            if (oldNumCount > 1) {
                frequencyToNumCount.put(frequency, --oldNumCount);
            } else {
                frequencyToNumCount.remove(frequency);
            }
        }

        if (numCount == null) {
            frequencyToNumCount.put(nextFrequency, 1);
        } else {
            frequencyToNumCount.put(nextFrequency, ++numCount);
        }

    }

    private void updateFrequencyToNumCount(Integer frequency, Integer nextFrequency) {
        Integer oldNumCount = frequencyToNumCount.get(frequency);
        Integer numCount = frequencyToNumCount.get(nextFrequency);

        if (oldNumCount != null) {
            if (oldNumCount > 1) {
                frequencyToNumCount.put(frequency, --oldNumCount);
            } else {
                frequencyToNumCount.remove(frequency);
            }
        }

        if (numCount == null) {
            frequencyToNumCount.put(nextFrequency, 1);
        } else {
            frequencyToNumCount.put(nextFrequency, ++numCount);
        }
    }

    public void deleteOne(int number) {
        Integer frequency = numToFrequency.get(number);
        if (frequency != null) {
            int nextFrequency = frequency - 1;
            if (nextFrequency > 0) {
                numToFrequency.put(number, nextFrequency);
            } else {
                numToFrequency.remove(number);
            }

            this.updateFrequencyToNumCount(frequency, nextFrequency);
        }
    }

    public boolean hasFrequency(int frequency) {
        return frequencyToNumCount.containsKey(frequency);

    }
}
