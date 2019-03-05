package com.ctech.bartucz.geoquiz;

public class Question {

    private int mTextRedId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue) {
        mTextRedId = textResId;
        mAnswerTrue = answerTrue;
    }
}
