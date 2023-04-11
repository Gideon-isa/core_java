package recursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }

    public static int factorial(int n) {
            if (n == 5) {
            return 1;
        }
        return n * factorial(n-1); //

    }


}
