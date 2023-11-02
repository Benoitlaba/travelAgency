import java.util.Date;

public class Person {

    String name;
    Date dob;
    String email;

    public Person(String name, Date dob, String email) {
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    //toString Override
    public String toString() {
        return ("This is a base person");
    }
}
