package Bai_2_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Employee {
    // Fields
    private final String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private int salary;
    private double coefficientsSalary;

    // Constructors
    public Employee() {
        this.id = "";
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.age = 0;
        this.salary = 0;
        this.coefficientsSalary = 0.0;
    }

    public Employee(String id, String firstName, String middleName, String lastName, int age, int salary, double coefficientsSalary) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return String.format("%s %s %s", firstName, middleName, lastName);
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return (double) salary * coefficientsSalary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Change age now base on Date (dd/MM/yy)
     *
     * @param dob String of date
     */
    public void setAge(String dob) {
        try {
            // Define date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Parse the DOB string into a LocalDate object
            LocalDate birthDate = LocalDate.parse(dob, formatter);

            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Calculate the age using Period.between()
            this.age = Period.between(birthDate, currentDate).getYears();
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use 'dd/MM/yyyy'.");
        }
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public String getInfo() {
        return String.format(
                "Employee [id=%s, firstName=%s, middleName=%s, lastName=%s, age=%d, baseSalary=%d, coefficientsSalary=%.1f]",
                getId(), firstName, middleName, lastName, getAge(), salary, getCoefficientsSalary()
        );
    }
}
