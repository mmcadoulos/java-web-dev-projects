package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> studentInfo = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;
        Integer studentID;
        System.out.println("Please enter student's info (ENTER to finish): ");
        do {
            System.out.println("Student's name: ");
            studentName = input.nextLine();
            // add code for the ID info
            if(!studentName.isEmpty()){
                System.out.println("Student's ID number: ");
                studentID = input.nextInt();

                studentInfo.put(studentID, studentName);
                input.nextLine();
            }
        }while(!studentName.isEmpty());
        input.close();
        System.out.println("\nClass Roster:");
        for (Map.Entry<Integer, String> student : studentInfo.entrySet()){
            System.out.println(student.getValue() + "'s student ID is: " + student.getKey());
        }
        System.out.println("\nTotal number of students: " + studentInfo.size());
    }
}
