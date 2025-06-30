package Arrays.Easy;

public class SingleNumber {
    public int findSingle(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }


    public static void main(String[] args) {
        SingleNumber finder = new SingleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        int unique = finder.findSingle(nums);
        System.out.println("The single number is: " + unique);
    }
}
