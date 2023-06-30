package Day3.Bai1;

// Lớp con Manager kế thừa từ lớp Employee
class Manager extends Employee {
    private String department;

    public Manager(String name, String id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    // Phương thức ghi đè (override) của lớp cha
    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Department: " + department);
    }
}
