package myinterface;

public class Aeroplane implements Aircraft{

    @Override
    public String liftOff() {
        return "Say lift off";
    }

    @Override
    public int speed() {
        return 3490;
    }

    public static void main(String[] args) {
        Aircraft.altitude();

    }
}
