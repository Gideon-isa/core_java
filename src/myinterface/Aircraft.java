package myinterface;

public interface Aircraft {
    // variable is public, final and static
    int wings = 2;

    String liftOff();

    // METHODS WITH BODY CAN ONLY BE:
    // 1.  Static
    static String altitude() {
        return "";
    }

    // 2. default
    default int speed() {
        return 200;
    }

}
