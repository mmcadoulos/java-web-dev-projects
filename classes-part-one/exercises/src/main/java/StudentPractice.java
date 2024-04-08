import java.util.Scanner;

public class StudentPractice {
    public static void main(String[] args) {
        //instantiate your Student class below
        Student javaStudent1 = new Student("Micah", 1441, 180, 3.2);
        Student javaStudent2 = new Student("Moses", 2882, 0, 0);
        Teacher javaTeacher = new Teacher("Philip", "Hodges", "Web Development", 3);
        Course course = new Course("Intro to Java", javaTeacher);
//        course.printCourseInfo();
//        course.addStudent(javaStudent1);
//        course.addStudent(javaStudent2);
//        course.printCourseInfo();

        Scanner input = new Scanner(System.in);
        String answer;
        do {
            if (course.getStudentList().isEmpty()) {
                System.out.print("Would you like to add students to the class? (Y/N): ");
                answer = input.nextLine();
            } else {
                System.out.print("Would you like to add another student to the class (Y/N): ");
                answer = input.nextLine();
            }
            if (answer.equalsIgnoreCase("y")) {
                String name;
                int id;
                int credits;
                double gpa;
                System.out.println("Student name: ");
                name = input.nextLine();
                System.out.println("Student ID: ");
                id = input.nextInt();
                System.out.println("Student's current completed credit-hours: ");
                credits = input.nextInt();
                System.out.println("Student current GPA: ");
                gpa = input.nextDouble();

                course.addStudent(new Student(name,id,credits,gpa));

//                input.nextLine();
            }
        } while (answer.equalsIgnoreCase("y"));
        input.close();
        course.printCourseInfo();
    }
}
