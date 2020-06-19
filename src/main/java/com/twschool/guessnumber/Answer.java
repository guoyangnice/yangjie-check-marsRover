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
        List<String> userInputList = Arrays.asList(userInputString.split(" "));
        List<String> randomList = Arrays.asList(randomNumberString.split(" "));
        int valueAndPositionCorrect = 0;
        int valueIncorrectAndPositionCorrect = 0;
        for(int i = 0; i < 4;i++){
            if(userInputList.get(i).equals(randomList.get(i))){
                valueAndPositionCorrect++;
            }else{
                valueIncorrectAndPositionCorrect++;
            }
        }
        return valueAndPositionCorrect + "A" + valueIncorrectAndPositionCorrect + "B";
    }
}
