public class tiling {
    public static int tiling_Problem(int n) {
        // base case
        if (n==0 || n==1) {
            return 1;
        }
        // for vertical choices
        int fnm1 = tiling_Problem(n-1);
        // for horizontal choices
        int fnm2 = tiling_Problem(n-2);
        //total number of ways
        return fnm1+fnm2;
    }
    
    public static void main(String[] args) {
        int n = 10;
        tiling_Problem(n);
    }
}
