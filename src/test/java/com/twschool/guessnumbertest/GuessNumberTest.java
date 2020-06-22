package com.twschool.guessnumbertest;

import cm.twschool.guessnumber.Answer;
import cm.twschool.guessnumber.Game;
import cm.twschool.guessnumber.Generator;
import cm.twschool.guessnumber.Status;
import org.junit.Assert;
import org.junit.Test;

public class GuessNumberTest {
    @Test
    public void should_return_0_A_0_B_when_enter_1234_given_5678(){
        //Given
        Answer answer = new Answer("1 2 3 4");
        //When
        String result = answer.check("5 6 7 8");
        //Then
        Assert.assertEquals("0A0B",result);
    }

    @Test
    public void should_return_4A0B_when_enter_1234_given_1234(){
        //Given
        Answer answer = new Answer("1 2 3 4");
        //When
        String result = answer.check("1 2 3 4");
        //Then
        Assert.assertEquals("4A0B",result);
    }

    @Test
    public void should_return_0A4B_when_enter_1234_given_3421(){
        //Given
        Answer answer = new Answer("1 2 3 4");
        //When
        String result = answer.check("3 4 2 1");
        //Then
        Assert.assertEquals("0A4B",result);
    }

    @Test
    public void should_return_0A3B_when_enter_1234_given_2345(){
        //Given
        Answer answer = new Answer("1 2 3 4");
        //When
        String result = answer.check("2 3 4 5");
        //Then
        Assert.assertEquals("0A3B",result);
    }

    @Test
    public void should_return_1A1B_when_enter_1234_given_1567(){
        //Given
        Answer answer = new Answer("1 2 3 4");
        //When
        String result = answer.check("1 5 6 7");
        //Then
        Assert.assertEquals("1A0B",result);
    }

    @Test
    public void should_return_1A2B_when_enter_1234_given_1435(){
        //Given
        Answer answer = new Answer("1 2 3 4");
        //When
        String result = answer.check("1 3 4 5");
        //Then
        Assert.assertEquals("1A2B",result);
    }

    @Test
    public void should_return_succeed_status_when_enter_1234_and_status_and_time_given_1234(){
        //Given
        Answer answer = new Answer("1 2 3 4");
        Game game = new Game(answer);
        //When
        String status = game.guess("1 2 3 4");
        //Then
        Assert.assertEquals(Status.SUCCEED.name(),status);
    }

    @Test
    public void should_return_failed_status_when_enter_5678_and_status_and_time_given_1234(){
        //Given
        Answer answer = new Answer("1 2 3 4");
        Game game = new Game(answer);
        //When
        String status1 = game.guess("5 6 7 8");
        String status2 = game.guess("5 6 7 8");
        String status3 = game.guess("5 6 7 8");
        String status4 = game.guess("5 6 7 8");
        String status5 = game.guess("5 6 7 8");
        String status6 = game.guess("5 6 7 8");
        //Then
        Assert.assertEquals(Status.FAILED.name(),status6);
    }

    @Test
    public void should_return_continued_status_when_enter_5678_and_status_and_time_given_1234(){
        //Given
        Answer answer = new Answer("1 2 3 4");
        Game game = new Game(answer);
        //When
        game.guess("5 6 7 8");
        game.guess("5 6 7 8");
        game.guess("5 6 7 8");
        game.guess("5 6 7 8");
        String status5 = game.guess("5 6 7 8");
        //Then
        Assert.assertEquals(Status.CONTINUED.name(),status5);
    }

    @Test
    public void should_return_random_when_enter_random_and_status_and_time_given_random(){
        //Given
        Generator generator = new Generator();
        boolean b = false;
        //When,注意这里是只有一次校验
        String randomStr = generator.generaotrRondomNumber();
        String randomStrSplit = randomStr.replace(" ","");
        for(int i = 0; i < randomStrSplit.length(); i++){
            for(int j = i+1;j <randomStrSplit.length(); j++){
                if(!String.valueOf(randomStrSplit.charAt(i)).equals(String.valueOf(randomStrSplit.charAt(j)))){
                    b = true;
                }
            }
        }
        //Then
        Assert.assertEquals(true,b);
    }
}
