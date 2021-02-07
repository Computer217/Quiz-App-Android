package com.example.a2021_02_quizapp.model;

import com.example.a2021_02_quizapp.R;

public class AllQuestions {
    //array of questions we load in from strings XLM

    private int currentQuestion = 0;

    public Question[] allQuestions = {
            new Question(R.string.start_q, true),
            new Question(R.string.continent_q, true),
            new Question(R.string.oceans_q, false)
    };

    public AllQuestions() {currentQuestion = 0;}

    public Question getQuestion(int index){
        index = index % allQuestions.length;
        return allQuestions[index];
    }
}

