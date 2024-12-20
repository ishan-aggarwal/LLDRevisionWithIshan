package collections.additionalproblems.q4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static Map<Integer, Integer> countFrequencies(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 1, 2, 3, 4, 5, 1};
        Map<Integer, Integer> ans = countFrequencies(nums);

        System.out.println(ans);

    }
}
