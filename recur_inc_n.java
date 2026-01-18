public class recur_inc_n {
     
   
    public static int recursive_fxn(int n){
           if (n == 1){
            System.out.println(n+"");
            return n;
           }
            recursive_fxn( n-1);
            System.out.println(n+"");
            return n;
           
           
    }
    public static void main(String[] args) {
        int n = 10;
        recursive_fxn(n);
    }
}


