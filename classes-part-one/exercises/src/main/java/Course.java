import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> studentList = new ArrayList<>();
    //    private Teacher teacher = new Teacher("Phillip", "Hodges", "Web Development", 5);
    private Teacher teacher;

    // Constructor
    public Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
//        System.out.println("Use .addStudent() to create the roster!");
    }

    // Set Methods
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

    // General Methods
    public void printCourseInfo() {
        System.out.println("\nCourse name: " + this.courseName + "\nTeacher name: " + this.teacher.getLastName() + ", " + this.teacher.getFirstName() + "\nStudents:");
        if (this.studentList.isEmpty()) {
            System.out.println("No students are enrolled!");
        } else {
            for (Student student : this.studentList) {
                System.out.println(student.getName());
            }
            System.out.println(this.studentList.size() + " student(s) enrolled");
        }
    }

}