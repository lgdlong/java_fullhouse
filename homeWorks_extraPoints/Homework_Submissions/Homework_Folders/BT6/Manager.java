package Bai_2_8;

public class Manager extends Employee {
    private double bonusRate;

    public Manager() {
        super();
    }

    public Manager(String id, String name, int salary, double coefficientsSalary, double bonusRate) {
        super(id, name, salary, coefficientsSalary);
        this.bonusRate = bonusRate;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() * (1 + bonusRate);
    }

    @Override
    public String toString() {
        return "Manager [" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", coefficientsSalary=" + getCoefficientsSalary() +
                ", bonusRate=" + bonusRate +
                ']';
    }
}
