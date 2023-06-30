package Day3.Bai5;

// Lớp chính để thực thi
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng quản lý ứng dụng
        StudentManagementSystem sms = new StudentManagementSystem();

        // Tạo đối tượng sinh viên
        Student student1 = new Student("S001", "Quang Bao");
        Student student2 = new Student("S002", "Dang Khoa");

        // Tạo đối tượng khóa học
        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");
        Course course3 = new Course("C003", "Data Analyst");

        // Thêm sinh viên và khóa học vào ứng dụng quản lý
        sms.addStudent(student1);
        sms.addStudent(student2);
        sms.addCourse(course1);
        sms.addCourse(course2);
        sms.addCourse(course3);


        // Đăng ký học phần cho sinh viên
        sms.enrollStudent(student1, course1);
        sms.enrollStudent(student1, course2);
        sms.enrollStudent(student1, course3);

        sms.enrollStudent(student2, course1);
        sms.enrollStudent(student2, course3);


        // Hiển thị thông tin đăng ký học phần
        System.out.println("Enrollments:");
        for (Enrollment enrollment : sms.getEnrollments()) {
            System.out.println("Student: " + enrollment.getStudent().getName());
            System.out.println("Course: " + enrollment.getCourse().getName());
            System.out.println("---------------------------");
        }
    }
}