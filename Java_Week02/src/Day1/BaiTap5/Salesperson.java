package Day1.BaiTap5;

public class Salesperson extends Employee{
    final float hoahong=1/10;
    public Salesperson(String name, double salary) {
        super(name, salary);
    }

    public double calculateSalary() {
        // Perform salary calculation specific to salespersons
        // Example: return baseSalary + commission;
        return getSalary()+getSalary()*hoahong;
    }
}
//Tạo một abstract class image với các phương thức trừu tượng như display(),réize(),rotate().Tạo một interface Filter với các phương thức applyFilter(). Tạo lớp JPEGImage kế thừa từ Image và triển khai các phương thức trừu tượng, v cài đặt interface Filter để áp dụng các bộ lọc cho hình ảnh JPEG






