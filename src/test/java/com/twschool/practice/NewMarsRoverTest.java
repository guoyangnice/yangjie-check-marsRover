package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class NewMarsRoverTest {
    @Test
    public void should_return_x_0_y_0_direction_N_when_given_x_0_y_0_direction_N(){
        //given
        NewMarsRover newMarsRover = new NewMarsRover(0,0,"N");
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("L");
        //then
        Assert.assertEquals(0,position.getX());
        Assert.assertEquals(0,position.getY());
        Assert.assertEquals("N",position.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_W_when_given_x_0_y_0_direction_N(){
        //given
        NewMarsRover newMarsRover = new NewMarsRover(0,0,"N");
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("L");
        //then
        Assert.assertEquals(0,position.getX());
        Assert.assertEquals(0,position.getY());
        Assert.assertEquals("W",position.getDirection());
    }



}
