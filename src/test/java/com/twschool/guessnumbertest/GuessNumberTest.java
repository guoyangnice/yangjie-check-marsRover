package com.twschool.guessnumbertest;

import com.twschool.guessnumber.Answer;
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
}
