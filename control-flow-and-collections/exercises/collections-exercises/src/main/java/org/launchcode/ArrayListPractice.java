package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(4);
                add(22);
                add(35);
                add(2);
                add(5);
                add(7);
                add(95);
                add(30);
            }
        };

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("banana");
        wordList.add("apple");
        wordList.add("pear");
        wordList.add("bills");
        wordList.add("I");
        wordList.add("am");
        wordList.add("bee");

        String seuss = "I would not could not in a box" +
                " I would not could not with a fox" +
                " I will not eat them in a house" +
                " I will not eat them with a mouse";
        ArrayList<String> longList = new ArrayList<String>(Arrays.asList(seuss.split(" ")));

        System.out.println(sumEvens(myList));
        printWords(wordList);
        printLengthWords(wordList);
        printLengthWords(longList);
    }
    public static int sumEvens (ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if ((i % 2) == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void printWords(ArrayList<String> arr){
        for (String word : arr){
            if (word.length() == 5){
                System.out.println(word + " is 5 letters long");
            }
        }
    }

    public static void printLengthWords(ArrayList<String> arr){
        int selectLength;
        Scanner input = new Scanner(System.in);
        System.out.println("Let's search a word list for words of a specific length. Please enter how many letters the word should contain: ");
        selectLength = input.nextInt();


        for (String word : arr){
            if (word.length() == selectLength){
                System.out.println(word + " is " + selectLength + " letters long");
            }
        }
    }
}
