package Arrays.Easy;

import java.util.HashMap;

public class subarraySum {
    public static int subarraySum(int[] arr, int k) {
        int count = 0;
        int currentSum =0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum -k);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count ;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1, 1, 2};
        int k = 3;
        int result = subarraySum.subarraySum(arr, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}
