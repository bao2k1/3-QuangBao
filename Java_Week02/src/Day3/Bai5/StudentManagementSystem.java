package Day3.Bai5;

import java.util.ArrayList;
import java.util.List;

// Lớp quản lý ứng dụng
// Lớp quản lý ứng dụng
class StudentManagementSystem {
    private List<Student> students;
    private List<Course> courses;
    private List<Enrollment> enrollments;

    public StudentManagementSystem() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        enrollments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void enrollStudent(Student student, Course course) {
        Enrollment enrollment = new Enrollment(student, course);
        enrollments.add(enrollment);
        student.addEnrollment(enrollment);
    }

    public void withdrawStudent(Student student, Course course) {
        Enrollment enrollment = findEnrollment(student, course);
        if (enrollment != null) {
            enrollments.remove(enrollment);
            student.removeEnrollment(enrollment);
        }
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    private Enrollment findEnrollment(Student student, Course course) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudent().equals(student) && enrollment.getCourse().equals(course)) {
                return enrollment;
            }
        }
        return null;
    }
}
