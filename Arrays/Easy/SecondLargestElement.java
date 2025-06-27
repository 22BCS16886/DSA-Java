package Arrays.Easy;

public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest element");
                return -1; // or throw an exception
            }

            else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int [] arr = {1,23,67,89,-23,45,90};
        System.out.println(findSecondLargest(arr));
    }
}
