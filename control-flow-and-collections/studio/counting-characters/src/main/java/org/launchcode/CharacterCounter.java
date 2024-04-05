package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String userStr;

//         // Original for static string
//        char[] charInString = str.toCharArray();
//        HashMap<Character, Integer> countedChars = new HashMap<>();
//
//        for (char letter : charInString){
//            if (!countedChars.containsKey(letter)){
//                countedChars.put(letter, 1);
//            } else /*if (countedChars.containsKey(letter))*/ {
//                countedChars.put(letter, countedChars.get(letter)+1);
//            }
//        }
//
//        for (Map.Entry<Character, Integer> letter : countedChars.entrySet()) {
//            System.out.println("character: '" + letter.getKey() + "' occurred " + letter.getValue() + " times.");
//        }
//
//        // print hard coded string
//        countCharacters(str);


        // user input string
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any text: ");
        userStr = input.nextLine();
        input.close();

        countCharacters(userStr);

    }

    private static void countCharacters(String arg) {
        char[] charInString = arg.toLowerCase().toCharArray();
        HashMap<Character, Integer> countedChars = new HashMap<>();

        for (char letter : charInString) {
            if (Character.isAlphabetic(letter)) {
                if (!countedChars.containsKey(letter)) {
                    countedChars.put(letter, 1);
                } else {
                    countedChars.put(letter, countedChars.get(letter) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> letter : countedChars.entrySet()) {
            System.out.println("character: '" + letter.getKey() + "' occurred " + letter.getValue() + " times.");
        }

    }
}
