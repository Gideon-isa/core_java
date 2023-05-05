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
        System.out.println("In Man test2 method");
    };


    public static void main(String[] args) {
        LivingThing man = new Man();
        man.test2();

    }
}
