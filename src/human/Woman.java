package human;

public class Woman extends Human {
    public void human() {
        System.out.println("In woman class");
    }

    public static void main(String[] args) {
        Human man = new Woman();
        man.human();
    }
}
