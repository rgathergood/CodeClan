public abstract class Employee {
    private String name;
    private String nationalInsurance;
    private double salary;

    public Employee(String name, String nationalInsurance, double salary) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double raise) {
        return this.salary * raise;
    }

    public double payBonus(double bonus) {
        return salary * bonus;
    }

}
