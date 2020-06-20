package com.twschool.guessnumbertest;

import com.twschool.guessnumber.Answer;
import com.twschool.guessnumber.Game;
import com.twschool.guessnumber.Status;
import org.junit.Assert;
import org.junit.Test;

public class GuessNumberTest {
    @Test
    public void should_return_0_A_0_B_when_enter_1234_given_3456(){
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
        Assert.assertEquals("1A1B",result);
    }

    @Test
    public void should_return_1A3B_when_enter_1234_given_1435(){
        //Given
        Answer answer = new Answer("1 2 3 4");
        //When
        String result = answer.check("1 3 4 5");
        //Then
        Assert.assertEquals("1A3B",result);
    }

    @Test
    public void should_return_status_when_enter_1234_and_status_and_time_given_1234(){
        //Given
        Answer answer = new Answer("1 2 3 4");
        Game game = new Game(answer);
        //When
        String status = game.guess("1 2 3 4");
        //Then
        Assert.assertEquals(Status.SUCCEED.name(),status);
    }

    @Test
    public void should_return_status_when_enter_5678_and_status_and_time_given_1234(){
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
}
