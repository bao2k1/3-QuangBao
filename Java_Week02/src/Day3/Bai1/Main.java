package Day3.Bai1;

// Lớp chính để thực thi
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Manager và Engineer
        Manager manager = new Manager("John Doe", "M001", 5000, "IT");
        Engineer engineer = new Engineer("Jane Smith", "E001", 3000, "Software Development");

        // Gọi phương thức hiển thị thông tin của Manager và Engineer
        System.out.println("Manager Information:");
        manager.displayInformation();

        System.out.println("\nEngineer Information:");
        engineer.displayInformation();
    }
}
