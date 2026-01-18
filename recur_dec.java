public class recur_dec {
   
    public static int recursive_fxn(int n){
           if (n == 0){
            return n;
           }
           System.out.println(n+"");
           
           return recursive_fxn( n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        recursive_fxn(n);
    }
}
