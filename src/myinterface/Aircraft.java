package myinterface;

public interface Aircraft {
    /**
     * variable is public, final and static
     *
     */
    //
    int wings = 2;

    /**
     * Methods of interface are "public abstract" so no need to add those modifiers
     * @return
     */
    String liftOff();

    /**
     *  METHODS WITH BODY CAN ONLY BE:
     *
     *  1.  Static || This method cannot be inherited
     *
     * @return
     */

    static String altitude() {
        return "";
    }

    /**
     * 2. default || not a mandatory method to be implemented by the subclass
     *
     * @return
     */
    //
    default int speed() {
        return 200;
    }

    /**
     * Important Points About Interface or Summary of the Article:
     *
     * We can’t create an instance(interface can’t be instantiated) of the interface but we can make the reference of it that refers to the Object of its implementing class.
     * A class can implement more than one interface.
     * An interface can extend to another interface or interface (more than one interface).
     * A class that implements the interface must implement all the methods in the interface.
     * All the methods are public and abstract. And all the fields are public, static, and final.
     * It is used to achieve multiple inheritances.
     * It is used to achieve loose coupling.
     * Inside the Interface not possible to declare instance variables because by default variables are public static final.
     * Inside the Interface constructors are not allowed.
     * Inside the interface main method is not allowed.
     * Inside the interface static ,final,private methods declaration are not possible.
     *
     */

}
