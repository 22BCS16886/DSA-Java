package Arrays.Easy;

public class isSortedAndRotated {
    public static boolean SortandRotate(int []arr){
        boolean flag = true;
        int n = arr.length ;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > arr[(i+1)%n]){
                count ++;
                if(count > 1){
                    return false;
                }

            }
        }
        return true ;
    }

    public static void main(String[] args) {
        int [] arr = {2,1,3,4};
        System.out.println(SortandRotate(arr));
    }
}
