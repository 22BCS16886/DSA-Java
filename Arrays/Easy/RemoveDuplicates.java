package Arrays.Easy;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        int newLength = removeDuplicates(nums);

        System.out.println("After removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nLength of array after duplicates removed: " + newLength);
    }
}
