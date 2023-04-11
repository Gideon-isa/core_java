package constructor;

public class Construct {
    int num1;
    int num2;
    int num3;

    Construct(int num1) {
        this.num1 = num1;
    }
    Construct(int nu1, int nu2, int nu3) {
        this.num1 = nu1;
        this.num2 = nu2;
        this.num3 = nu3;
    }
    Construct() {
        //this invokes any of the previously declared constructor depending on its arguments passed
        // and passes those values. It must come first
        this(4); // this invokes the first constructor
    }

    public static void main(String[] args) {
        int i = 0;
        for(;i< 7; i++) {

         }
    }
}
