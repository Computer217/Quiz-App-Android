package com.example.a2021_02_quizapp.model;

public class Question {

    private int id;
    private boolean isAnswerTrue;

    public Question(int id, boolean isTrue){
        this.id = id;
        isAnswerTrue = isTrue;

    }

    public int getQuestionID() {return id;}

    public boolean isQuestionTrue() { return isAnswerTrue; }
}
