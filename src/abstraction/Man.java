package abstraction;

public class Man extends LivingThing{

    public Man() {
    }

    @Override
    public void sound() {

    }

    @Override
    public int test3() {
        return 0;
    }

    @Override
    public void test2() {
        System.out.println("In Man test2 method Subclass");
    };

    public static void test5() {
        System.out.println("Static method in Man Class");
    };


    public static void main(String[] args) {
        LivingThing man = new Man();
        Man man1 = new Man();
//        man.test2();
//
//        LivingThing.test5();
//        Man.test5();

        man1.test2();

    }
}
