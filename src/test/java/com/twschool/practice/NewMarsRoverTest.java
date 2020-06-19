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

    //移动
    @Test
    public void should_return_x__1_y_0_direction_N_when_given_x_0_y_0_direction_W(){
        //given
        NewMarsRover newMarsRover = new NewMarsRover(0,0,"W");
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("M");
        //then
        Assert.assertEquals(-1,position.getX());
        Assert.assertEquals(0,position.getY());
        Assert.assertEquals("W",position.getDirection());
    }

    @Test
    public void should_return_x_0_y__1_direction_S_when_given_x_0_y_0_direction_S(){
        //given
        NewMarsRover newMarsRover = new NewMarsRover(0,0,"W");
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("M");
        //then
        Assert.assertEquals(0,position.getX());
        Assert.assertEquals(-1,position.getY());
        Assert.assertEquals("S",position.getDirection());
    }

    @Test
    public void should_return_x_1_y_0_direction_E_when_given_x_0_y_0_direction_E(){
        //given
        NewMarsRover newMarsRover = new NewMarsRover(0,0,"E");
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("M");
        //then
        Assert.assertEquals(1,position.getX());
        Assert.assertEquals(0,position.getY());
        Assert.assertEquals("E",position.getDirection());
    }

    @Test
    public void should_return_x_0_y_1_direction_N_when_given_x_0_y_0_direction_N(){
        //given
        NewMarsRoverPosition newMarsRoverPosition = new NewMarsRoverPosition(0,0,"N");
        NewMarsRover newMarsRover = new NewMarsRover(newMarsRoverPosition);
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("M");
        //then
        Assert.assertEquals(0,position.getX());
        Assert.assertEquals(1,position.getY());
        Assert.assertEquals("N",position.getDirection());
    }

    //改善
    @Test
    public void should_return_x_0_y_0_direction_W_when_given_x_0_y_0_direction_N_2(){
        //given
        NewMarsRoverPosition newMarsRoverPosition = new NewMarsRoverPosition(0,0,"N");
        NewMarsRover newMarsRover = new NewMarsRover(newMarsRoverPosition);
        //when
        NewMarsRoverPosition position = newMarsRover.exeute("L");
        //then
        Assert.assertEquals(0,newMarsRover.getNewMarsRoverPosition().getX());
        Assert.assertEquals(0,newMarsRover.getNewMarsRoverPosition().getY());
        Assert.assertEquals("W",newMarsRover.getNewMarsRoverPosition().getDirection());
    }

}
