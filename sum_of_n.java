public class sum_of_n {
   public static int calc_sum_of_n(int n){
       if (n==0){
        return 0;
       }
       int sum = n + calc_sum_of_n(n-1);
       return sum;
   }
   
    public static void main(String[] args) {
        int n = 3;
        System.out.println(calc_sum_of_n(n));
    }
}
