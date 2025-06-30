package Arrays.Medium;

public class SortColor {
    public void sortColors(int[] nums) {
        int low =0 , mid =0 , high = nums.length ;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp =  nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp =  nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        SortColor sorter = new SortColor();
        int[] nums = {2, 0, 2, 1, 1, 0};
        sorter.sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
