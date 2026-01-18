
public class fact {

    public static int factorial_(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = n * factorial_(n - 1);
        return fact;

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial_(n));
    }
}
