package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void should_return_0_1_when_move_given_n(){
        //Given
        MarsRover r = new MarsRover();
        //When
        String xyn = r.getPoint(0,0,"N",true);
        //Then
        Assert.assertEquals(xyn,"0,1");

    }

    @Test
    public void should_return_x_y_when_move_given_s(){
        //Given
        MarsRover r = new MarsRover();
        //When
        String xys = r.getPoint(0,0,"S",true);
        //Then
        Assert.assertEquals(xys,"0,-1");
    }

    @Test
    public void should_return_x_y_when_move_given_e(){
        //Given
        MarsRover r = new MarsRover();
        //When
        String xye = r.getPoint(0,0,"E",true);
        //Then
        Assert.assertEquals(xye,"1,0");
    }

    @Test
    public void should_return_x_y_when_move_given_w(){
        //Given
        MarsRover r = new MarsRover();
        //When
        String xyw = r.getPoint(0,0,"W",true);
        //Then
        Assert.assertEquals(xyw,"-1,0");
    }
}
