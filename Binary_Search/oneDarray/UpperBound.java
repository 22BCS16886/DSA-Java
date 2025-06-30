package Binary_Search.oneDarray;

public class UpperBound {

    public static int upperBound(int[] arr, int x, int n) {
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 6};
        int x = 4;
        int index = upperBound(arr, x, arr.length);
        System.out.println("Upper bound index of " + x + " is: " + index);
    }
}
