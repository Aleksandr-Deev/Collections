package Transport;

public class Mechanic<T extends Transport> {

    private final String firstName;
    private final String lastName;
    private final String company;

    public Mechanic(String firstName, String lastName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public boolean performMaintenance(T t) {
        return t.diagnostics();
    }

    public void fixCar(T t) {
        t.repair();
    }
}
