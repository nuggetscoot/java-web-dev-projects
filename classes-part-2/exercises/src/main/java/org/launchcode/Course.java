package org.launchcode;
import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // Constructors, getters, and setters...

    // Custom 'toString' method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course: ").append(topic);
        sb.append("\nInstructor: ").append(instructor);
        sb.append("\nEnrolled Students: ").append(enrolledStudents);
        return sb.toString();
    }

    // Custom 'equals' method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(topic, course.topic) &&
                Objects.equals(instructor, course.instructor) &&
                Objects.equals(enrolledStudents, course.enrolledStudents);
    }

    // hashCode() method should also be overridden when equals() is overridden
    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor, enrolledStudents);
    }
}

