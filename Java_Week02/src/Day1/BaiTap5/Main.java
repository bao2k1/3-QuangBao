package Day1.BaiTap5;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 5000);
        System.out.println(manager.getName()); // Output: John Doe
        System.out.println(manager.getSalary()); // Output: 5000
        manager.assignTask("Implement new feature");

        Developer developer = new Developer("Jane Smith", 4000,200);
        System.out.println(developer.getName()); // Output: Jane Smith
        System.out.println(developer.getSalary()); // Output: 4000
        System.out.println(developer.calculateSalary()); // Output: 4200

        Salesperson salesperson = new Salesperson("Mike Johnson", 3000);
        System.out.println(salesperson.getName()); // Output: Mike Johnson
    }
}

