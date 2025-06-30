package Arrays.Easy;

import java.util.Scanner;

public class MissingNumber {
    public static void missingNumber(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int expectedSum = (n * (n + 1)) / 2;

        int missingNo = expectedSum - sum;
        System.out.println("Missing number is: " + missingNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements (n-1): ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements (from 0 to n, with one missing):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        missingNumber(arr);
        sc.close();
    }
}
