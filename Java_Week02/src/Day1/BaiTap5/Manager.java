package Day1.BaiTap5;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void assignTask(String task) {
        System.out.println(getName() + " has assigned the task: " + task);
    }
}
