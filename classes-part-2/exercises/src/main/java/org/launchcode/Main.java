package org.launchcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student micah = new Student("Micah", 1441, 124, 3.2);
        Student moses = new Student("Moses", 2882, 0, 0);
        Student ruth = new Student("Ruth", 3333, 59, 3.92);
        Student jerubbaal = new Student("Jerubbaal", 2456, 60, 2.0);
        Teacher javaTeacher = new Teacher("Phillip", "Hodges", "Web Development", 3);
        Course course = new Course("Intro to Java", javaTeacher);

//         // Static course fun
//        System.out.println(course);
//        System.out.println("Let's add some students!");
//
//        course.addStudent(micah);
//        System.out.println(micah);
////        System.out.println(micah.getGradeLevel());
//
//        course.addStudent(moses);
//        System.out.println(moses);
////        System.out.println(moses.getGradeLevel());
//        moses.addGrade(4, 3);
//        System.out.println(moses.getGpa());
//        moses.addGrade(3, 4);
//        System.out.println(moses.getGpa());
//
//        course.addStudent(ruth);
//        course.addStudent(jerubbaal);
//
//        System.out.println(ruth);
//        System.out.println(jerubbaal);
//
//        System.out.println(course);


        // Dynamic course fun
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

                course.addStudent(new Student(name, id, credits, gpa));

                input.nextLine();
            }
        } while (answer.equalsIgnoreCase("y"));
        input.close();


        System.out.println(course);
        for (Student student : course.getStudentList()){
            System.out.println(student);
        }
    }
}
