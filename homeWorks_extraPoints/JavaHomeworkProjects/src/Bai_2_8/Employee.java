package Bai_2_8;

public class Employee {
    private String id;
    private String name;
    private int salary;
    private double coefficientsSalary;

    public Employee() {
    }

    public Employee(String id, String name, int salary, double coefficientsSalary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double calculateActualSalary() {
        return salary * coefficientsSalary;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", coefficientsSalary=" + coefficientsSalary +
                ']';
    }
}
