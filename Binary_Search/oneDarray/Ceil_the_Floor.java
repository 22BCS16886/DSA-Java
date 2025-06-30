package Binary_Search.oneDarray;

import java.util.*;

public class Ceil_the_Floor {

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int floor = -1, ceil = -1;

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] <= x) {
                floor = a[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] >= x) {
                ceil = a[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10};
        int x = 5;

        int[] result = getFloorAndCeil(arr, arr.length, x);
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);
    }
}
