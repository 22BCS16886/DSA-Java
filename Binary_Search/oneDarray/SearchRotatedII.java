package Binary_Search.oneDarray;

public class SearchRotatedII {

    public static boolean searchInARotatedSortedArrayII(int[] A, int key) {
        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (A[mid] == key) {
                return true;
            }

            if (A[low] == A[mid] && A[mid] == A[high]) {
                low++;
                high--;
                continue;
            }

            else if (A[low] <= A[mid]) {
                if (A[low] <= key && key <= A[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (A[mid] < key && key <= A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int key = 0;
        boolean found = searchInARotatedSortedArrayII(arr, key);
        System.out.println("Key " + key + " found: " + found);
    }
}
