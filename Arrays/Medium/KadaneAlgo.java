package Arrays.Medium;

public class KadaneAlgo {
    public static int maxSubArray(int[] arr) {
        int maxSum = arr[0];
        int currentSum = 0;

        for (int a : arr) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += a;
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
}
