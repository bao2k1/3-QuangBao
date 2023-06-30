package Day3.Bai5;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String id;
    private String name;
    private List<Enrollment> enrollments;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        enrollments = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public void removeEnrollment(Enrollment enrollment) {
        enrollments.remove(enrollment);
    }
}
