package Binary_Search.oneDarray;

public class MinRotated {

    public static int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = arr[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;
            ans = Math.min(ans, arr[mid]);

            if (arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int min = findMin(arr);
        System.out.println("Minimum element is: " + min);
    }
}
