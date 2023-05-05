package functionalinterface;

@FunctionalInterface
public interface Object {

    public abstract int calArea(double length, double breath);

    static String details() {
        return "";
    }

    /**
     * A Functional interface must have only one abstract method
     *
     * @FunctionalInterface annotation is used to ensure that the functional interface
     * can’t have more than one abstract method.
     */


}
