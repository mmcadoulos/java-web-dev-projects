package org.launchcode;
import java.awt.*;
import java.util.Scanner;
public class StringsD {
    public static void main(String[] args){
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to search for: ");
        String searchWord = input.nextLine();
        int termIndex = alice.toLowerCase().indexOf(searchWord.toLowerCase());
        int termLength = searchWord.length();
        // over-complicated for D but needed for E
        if (alice.toLowerCase().contains(searchWord.toLowerCase())){
            System.out.println(true + " this word is found at position " + termIndex + " out of " + alice.length() + " and is " + termLength + " characters long");
            String aliceUpdated = alice.toLowerCase().replace(searchWord.toLowerCase(), "");
            System.out.println(aliceUpdated);
        } else {
            System.out.println(false);
        }

//        // for D
//        System.out.println(alice.toLowerCase().contains(searchWord.toLowerCase()));
    }
}
