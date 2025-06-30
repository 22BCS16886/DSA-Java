package Arrays.Easy;

public class minFill {
    public static int minimumFill(String s){
        int cost = 0;
        int i = 0 ;
        int n = s.length();

        while(i<n){
            if(s.charAt(i)==0) {
                if (s.charAt(i) == '.' && s.charAt(i + 1) == '.' && s.charAt(i + 2) == '.') {
                    cost += 2;
                    i += 3;
                } else {
                    cost++;
                    i++;
                }
            }
            else{
                i++;
            }
        }
        return i ;
    }

    public static void main(String[] args) {
        String s ="..#.#...";
        System.out.println(minimumFill(s));
    }
}
