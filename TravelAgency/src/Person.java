import java.util.Date;

public class Person {

    private String name;
    private final Date dob;
    private String email;

    public Person(String name, Date dob, String email) {
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String toString() {
        return ("This is a base person");
    }
}
