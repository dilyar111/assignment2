import java.util.ArrayList;
import java.util.Collections;

interface Payable {
    double getPaymentAmount();
}
class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;

    private final int id;
    private String name;
    private String surname;

    // Constructors
    public Person() {
        this.id = idCounter++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // toString method
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    // getPosition method
    public String getPosition() {
        return "Student";
    }

    // Payable interface method
    @Override
    public double getPaymentAmount() {
        return 0.00;
    }

    // Comparable interface method
    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
