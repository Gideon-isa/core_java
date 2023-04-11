import java.util.Arrays;

public class PracticeOne {
    static String firstNAme = setName();

    static String setName() {
        return "Michael";
    }


    public static void main(String[] args) {
        int num1 = 5;
        float num2 = num1; // Implicit Casting
        //Or
        long num3 = (long) num1;
        long num4 = 4;

        System.out.println(num2);
        System.out.println(num3);

        //Explicit Casting
        long y = 42;
        int x = (int) y;

        System.out.println(x);

        byte myByte = (byte) 123456;
        byte myByte2 = (byte) 130;
        System.out.println(myByte2);

        int s = 10;
        int b = 30;
        go( s,  b);

        int[] bnm = {3,4,5,6,78,9};
        int[]result = PracticeOne.getMy(false, bnm);
        System.out.println(Arrays.toString(result));

    }

    public static void  go(double a, double b) {
        System.out.println(a +b);
    }

    static int[] getMy(boolean isValid, int... arr) {
        if (isValid) {
            for (int a: arr) {
                System.out.printf("the value is %d\n", a);
            }
        }
        return new int[]{};
    }
}
