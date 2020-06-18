package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_1_given_1() {
        //1、报数
        //given
        FizzBuzz fb = new FizzBuzz();
        //when
        String result = fb.say(1);
        //then
        Assert.assertEquals(result,"1");

        //2、fizz_3_buzz_5
        //when
        String result3 = fb.say(3);
        //then
        Assert.assertEquals(result3,"Fizz");


    }
}
