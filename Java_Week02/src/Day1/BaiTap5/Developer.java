package Day1.BaiTap5;

public class Developer extends Employee{
    private double bonus;

    public Developer(String name, double salary,double bonus) {
        super(name, salary);
        this.bonus=bonus;
    }

    public double calculateSalary() {
        // Perform salary calculation specific to developers
        // Example: return salary + bonus;
        return getSalary()+bonus;
    }
}
