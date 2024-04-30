package org.launchcode;
// https://excalidraw.com/#json=Of0ij9Eoqecw_89dGjjRj,lSFmp1cUL6Ii8AYixrKWOQ
public class QuizRunner {
    public static void main(String[] args) {
        // add objects of all classes
        TrueOrFalse trueOrFalse1 = new TrueOrFalse("Will this work?", 1, "true");
        TrueOrFalse trueOrFalse2 = new TrueOrFalse("Will this work again?", 2, "true");
        TrueOrFalse trueOrFalse3 = new TrueOrFalse("Will this work three times?", 7, "true");

        Quiz quiz = new Quiz();

        // quiz.addQuestions() for each question object
        quiz.addQuestions(trueOrFalse1);
        quiz.addQuestions(trueOrFalse2);
        quiz.addQuestions(trueOrFalse3);



        quiz.runQuiz();
        quiz.grade();

    }
}