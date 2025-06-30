package Binary_Search.oneDarray;

public class SearchInsert {

    public static int searchInsert(int[] arr, int m) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int m = 5;
        int index = searchInsert(arr, m);
        System.out.println("Insert position for " + m + ": " + index);
    }
}
