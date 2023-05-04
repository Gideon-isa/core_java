package human;

import java.time.LocalDate;

public class Woman extends Human {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Woman(String gender, String firstName, String lastName) {
        super(gender);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Woman(String gender, String firstName, String lastName, LocalDate dateOfBirth) {
        super(gender);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public void human() {
        System.out.println("In woman class");
    }

    @Override
    public void humanDetails() {
        super.humanDetails();
    }

    public void womanDetails() {
        System.out.println("In woman details");
        super.humanDetails();
    }

    public static void main(String[] args) {
        Human man = new Woman("female", "Mariam", "Isa");

    }
}
