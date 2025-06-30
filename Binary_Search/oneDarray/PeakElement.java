package Binary_Search.oneDarray;

import java.util.ArrayList;

public class PeakElement {

    public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size();

        if (n == 1) return 0;
        if (arr.get(0) > arr.get(1)) return 0;
        if (arr.get(n - 1) > arr.get(n - 2)) return n - 1;

        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int midVal = arr.get(mid);
            int left = arr.get(mid - 1);
            int right = arr.get(mid + 1);

            if (midVal > left && midVal > right) {
                return mid;
            } else if (midVal < right) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(20);
        arr.add(4);
        arr.add(1);

        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element found at index: " + peakIndex);
    }
}
