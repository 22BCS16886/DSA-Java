package Arrays.Easy;

import java.util.HashMap;

public class LongestSubArray {
    public static int longestSubArray(int[] nums, long k) {
        HashMap<Long, Integer> map = new HashMap<>();
        int maxLength = 0;
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLength = i + 1;
            }

            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLength = Math.max(maxLength, len);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 1, 1};
        long k = 3;
        int result = longestSubArray(a, k);
        System.out.println("Length of longest subarray with sum " + k + ": " + result);
    }
}
