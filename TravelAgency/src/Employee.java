import java.util.Date;
import java.util.Objects;

public class Employee extends Person{

    String position;
    public Employee(String position, String name, Date dob, String email) {
        super(name, dob, email);
        this.position = position;
    }

    //toString Override
    @Override
    public String toString() {
        return ("This is an employee");
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee employee = (Employee) obj;

        return Objects.equals(position, employee.position);

    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
