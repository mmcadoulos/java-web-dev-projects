package org.launchcode;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Questions> quizQuestions = new ArrayList<>();
    private int score = 0;
    private int total = 0;
//    private double grade;

//    public Quiz(ArrayList<Questions> quizQuestions, int score, int total) {
//        this.quizQuestions = quizQuestions;
//        this.score = score;
//        this.total = total;
//    }

    public void runQuiz() {
        for (int i = 0; i < quizQuestions.size(); i++) {
            quizQuestions.get(i).displayQuestions();
            quizQuestions.get(i).displayAnswers();
            score += quizQuestions.get(i).getCandidateAnswers() * quizQuestions.get(i).getPointValue();
        }
    }

    public void /*ArrayList<Questions>*/ addQuestions(Questions aQuestion) {
        quizQuestions.add(aQuestion);
    }

    public void grade() {
        for (Questions question : quizQuestions){
            this.total += question.getPointValue();
            }
//        grade = (double) score /total*100;
        System.out.println("Score " + score);
        System.out.println("Total " + total);
        System.out.println("Grade: " + (double)score / total * 100);
    }

    // Getters and Setters

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
