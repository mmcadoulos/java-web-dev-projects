package org.launchcode;

public class HelloMethods {

    public static void main(String[] args) {
        String message = Message.getMessage("el");
        System.out.println(message);
//        String str1 = "hello";
//        String str2 = "world";
        String str3 = "Κοσμε!";
//        System.out.println(str1.concat(message.concat(str2)));
//        System.out.println(message.contains("Κοσμε"));
        System.out.println(message.endsWith(str3));
    }

}