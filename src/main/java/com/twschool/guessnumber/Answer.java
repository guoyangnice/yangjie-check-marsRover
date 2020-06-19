package com.twschool.guessnumber;

import java.util.Arrays;
import java.util.List;

/**
 * 输入随机数，对比随机数和用户输入
 */
public class Answer {
    private String randomNumberString;

    public Answer(String randomNumberString) {
        this.randomNumberString = randomNumberString;
    }

    public String check(String userInputString){
        return "0A0B";
    }
}
