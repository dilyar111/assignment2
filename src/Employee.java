class Employee extends Person {
    private String position;
    private double sala3ry;

    // Constructors
    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    // Getters and Setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    // Payable interface method
    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
