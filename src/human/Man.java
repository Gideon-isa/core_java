package human;

import java.time.LocalDate;

public class Man extends Human {

    private String firstName;
    private String lastName;
    private LocalDate date;

    public Man(String gender, String firstName, String lastName, LocalDate date) {
        super(gender);
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;

    }
    @Override
    public void humanDetails() {
        System.out.println("In Man class");
    }
}
