package com.twschool.guessnumber;

/**
 * 游戏状态
 */
public class Game {
    private Answer answer;
    private static final int MAX_LIMIT = 6;
    private int step = MAX_LIMIT;
    public Game(Answer answer) {
        this.answer = answer;
    }

    public String guess(String userInputString) {
        String str = answer.check(userInputString);
        odd();
        if(("4A0B").equals(str)){
            return Status.SUCCEED.name();
        }
        return null;
    }

    private void odd(){
        step--;
    }
}
