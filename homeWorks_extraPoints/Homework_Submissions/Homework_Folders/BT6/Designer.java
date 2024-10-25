package Bai_2_8;

public class Designer extends Employee {
    private int numberOfCompletedProjects;
    private int numberOfProjectsUnderImplementation;
    private double bonusPerCompletedProject;
    private double bonusPerProjectUnderImplementation;

    public Designer() {
        super();
    }

    public Designer(String id, String name, int salary, double coefficientsSalary, int numberOfCompletedProjects, int numberOfProjectsUnderImplementation, double bonusPerCompletedProject, double bonusPerProjectUnderImplementation) {
        super(id, name, salary, coefficientsSalary);
        this.numberOfCompletedProjects = numberOfCompletedProjects;
        this.numberOfProjectsUnderImplementation = numberOfProjectsUnderImplementation;
        this.bonusPerCompletedProject = bonusPerCompletedProject;
        this.bonusPerProjectUnderImplementation = bonusPerProjectUnderImplementation;
    }

    public int getNumberOfCompletedProjects() {
        return numberOfCompletedProjects;
    }

    public int getNumberOfProjectsUnderImplementation() {
        return numberOfProjectsUnderImplementation;
    }

    public double getBonusPerCompletedProject() {
        return bonusPerCompletedProject;
    }

    public double getBonusPerProjectUnderImplementation() {
        return bonusPerProjectUnderImplementation;
    }

    public void setNumberOfCompletedProjects(int numberOfCompletedProjects) {
        this.numberOfCompletedProjects = numberOfCompletedProjects;
    }

    public void setNumberOfProjectsUnderImplementation(int numberOfProjectsUnderImplementation) {
        this.numberOfProjectsUnderImplementation = numberOfProjectsUnderImplementation;
    }

    public void setBonusPerCompletedProject(double bonusPerCompletedProject) {
        this.bonusPerCompletedProject = bonusPerCompletedProject;
    }

    public void setBonusPerProjectUnderImplementation(double bonusPerProjectUnderImplementation) {
        this.bonusPerProjectUnderImplementation = bonusPerProjectUnderImplementation;
    }

    @Override
    public double calculateActualSalary() {
        return  super.calculateActualSalary() +
                numberOfCompletedProjects * bonusPerCompletedProject +
                numberOfProjectsUnderImplementation * bonusPerProjectUnderImplementation;
    }

    @Override
    public String toString() {
        return "Designer [" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", coefficientsSalary=" + getCoefficientsSalary() +
                ", numberOfCompletedProjects=" + numberOfCompletedProjects +
                ", numberOfProjectsUnderImplementation=" + numberOfProjectsUnderImplementation +
                ", bonusPerCompletedProject=" + bonusPerCompletedProject +
                ", bonusPerProjectUnderImplementation=" + bonusPerProjectUnderImplementation +
                ']';
    }
}
