package Arrays.Easy;

import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        boolean found = linearSearch(arr, key);


        if (found) {
            System.out.println("Key found in the array.");
        } else {
            System.out.println("Key not found in the array.");
        }
        sc.close();
    }
}
