package Arrays;

public class LargestElement {
    public static int findLargest(int [] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr ={1,21,34,54,78,89,-23,45};
        System.out.println(findLargest(arr));
    }
}
