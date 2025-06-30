package Arrays.Easy;

public class MaxConsecutiveOne {
    public static int findMaxConsecutive(int []arr){
        int count = 0;
        int maxCount = 0;
        for(int i : arr){
            if(i == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else
                count = 0;
            }

        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutive(arr));  // Output: 3
    }

}
