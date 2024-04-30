package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(70, 0);
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Micah", "ExceptionsExercise.js");
//        System.out.println(studentFiles);

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> student : studentFiles.entrySet()){
            System.out.println(student.getKey() + "'s score: " + CheckFileExtension(student.getValue()));
        }
    }

    public static void Divide(int x, int y) {
        // Write code here!
        int solution = 0;
//        if (y == 0) {
        try {
            solution = x / y;
//                throw new ArithmeticException("Can't divide by zero!");
            System.out.println(solution);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("ERROR");
            return;
        }
//        }
//        System.out.println(solution);
    }

    public static int CheckFileExtension(String fileName) {
        int lastIndexOfDot = fileName.lastIndexOf('.');
        if (fileName.isBlank()) {
            try {
                throw new FileException("File is Null");
            } catch (FileException e) {
                e.printStackTrace();
                return -1;
            }
        } else if (fileName.substring(lastIndexOfDot + 1).equals("java")) {
            return 1;
        }
        return 0;
        // Write code here!
    }
}