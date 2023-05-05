package abstraction;

public abstract class LivingThing {

    public static final String name = "Aircraft";
    String type;

    //abstract method
    public abstract void sound();

    /**
     * This is an abstract method:
     * A method that doesn't have its body is known as an abstract method.
     * We use the same abstract keyword to create abstract methods.
     * There is no body implementation of the method
     * @return
     */
    public abstract int test3(); // no-body implementation; with abstract key word

    /**
     * This is a regular method
     *
     */
    // Regular method
    public void test2() {
        System.out.println("Abstract method");
    }

    /**
     * Regular Static method is allowed
     */
    public static void test5() {};

    private class living {

    }

    /**
     * An instance of an abstract class can not be created.
     * Constructors are allowed.
     * We can have an abstract class without any abstract method.
     * There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final  or in simpler terms final method can not be abstract itself as it will yield an error: “Illegal combination of modifiers: abstract and final”
     * We can define static methods in an abstract class
     * We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
     * If a class contains at least one abstract method then compulsory should declare a class as abstract
     * If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level Child class should provide implementation to the remaining abstract method
     *
     * Can not have a final method since subclasses will not be able to inherits the method
     *
     * Regular static method is allowed
     */



}
