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

    @Test
    public void should_return_x_0_y_0_direction_S_when_given_x_0_y_0_direction_W(){
        //given
        NewMarsRover newMarsRover = new NewMarsRover(0,0,"W");
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("L");
        //then
        Assert.assertEquals(0,position.getX());
        Assert.assertEquals(0,position.getY());
        Assert.assertEquals("S",position.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_E_when_given_x_0_y_0_direction_S(){
        //given
        NewMarsRover newMarsRover = new NewMarsRover(0,0,"S");
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("L");
        //then
        Assert.assertEquals(0,position.getX());
        Assert.assertEquals(0,position.getY());
        Assert.assertEquals("E",position.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_N_when_given_x_0_y_0_direction_E(){
        //given
        NewMarsRover newMarsRover = new NewMarsRover(0,0,"E");
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("L");
        //then
        Assert.assertEquals(0,position.getX());
        Assert.assertEquals(0,position.getY());
        Assert.assertEquals("N",position.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_E_when_given_x_0_y_0_direction_N(){
        //given
        NewMarsRover newMarsRover = new NewMarsRover(0,0,"N");
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("R");
        //then
        Assert.assertEquals(0,position.getX());
        Assert.assertEquals(0,position.getY());
        Assert.assertEquals("E",position.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_S_when_given_x_0_y_0_direction_E(){
        //given
        NewMarsRover newMarsRover = new NewMarsRover(0,0,"E");
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("R");
        //then
        Assert.assertEquals(0,position.getX());
        Assert.assertEquals(0,position.getY());
        Assert.assertEquals("S",position.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_W_when_given_x_0_y_0_direction_S(){
        //given
        NewMarsRover newMarsRover = new NewMarsRover(0,0,"S");
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("R");
        //then
        Assert.assertEquals(0,position.getX());
        Assert.assertEquals(0,position.getY());
        Assert.assertEquals("W",position.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_N_when_given_x_0_y_0_direction_W(){
        //given
        NewMarsRover newMarsRover = new NewMarsRover(0,0,"W");
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("R");
        //then
        Assert.assertEquals(0,position.getX());
        Assert.assertEquals(0,position.getY());
        Assert.assertEquals("N",position.getDirection());
    }
}
