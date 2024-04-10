package org.launchcode;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    //    private String topic;
//    private Teacher instructor;
//    private ArrayList<Student> enrolledStudents;
    private String courseName;
    private ArrayList<Student> studentList = new ArrayList<>();
    private Teacher teacher;

    public Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
    }
    public void setCourseName(String aCourseName) {
        this.courseName = aCourseName;
    }

    public void addStudent(Student aStudent) {
        this.studentList.add(aStudent);
    }

    public void setTeacher(Teacher aTeacher) {
        this.teacher = aTeacher;
    }

    // Get Methods
    public String getCourseName() {
        return this.courseName;
    }

    public ArrayList<Student> getStudentList() {
        return this.studentList;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString() {
        if (this.studentList.isEmpty()){
            return "\nCourse name: " + this.courseName + "\nTeacher name: " + this.teacher.getLastName() + ", " + this.teacher.getFirstName() + "\nNo students are enrolled!";
        }
        return "\nCourse name: " + this.courseName + "\nTeacher name: " + this.teacher.getLastName() + ", " + this.teacher.getFirstName() + "\n" + this.studentList.size() + " student(s) enrolled";
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseName, course.courseName) && Objects.equals(teacher, course.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, teacher);
    }
}
