package com.example.allymcgilloway.eightball_start_code;

/**
 * Created by allymcgilloway on 12/12/2017.
 */

public class EightBall {
    Answer answers;

    public EightBall(Answer answers){
        this.answers = answers;
    }

    public String randomAnswer(){
        return answers.getRandomAnswer();

    }

}
