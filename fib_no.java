public class fib_no {
   public static int fib_number(int n){
    if (n ==0 || n==1){
        return n;
    }
    
    int fnm1 = fib_number(n-1);
    int fnm2 = fib_number(n-2);
    int fib  = fnm1 + fnm2;
    return fib;
   }
   
    public static void main(String[] args) {
        int n = 25;
       System.out.println(fib_number(n)); 

    }
}
