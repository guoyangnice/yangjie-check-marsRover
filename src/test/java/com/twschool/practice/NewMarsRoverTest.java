package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class NewMarsRoverTest {
    @Test
    public void should_return_x_0_y_0_direction_N_when_given_x_0_y_0_direction_N(){
        //given
        NewMarsRoverPosition newMarsRoverPosition = new NewMarsRoverPosition(0,0,"N");
        NewMarsRover newMarsRover = new NewMarsRover();
        newMarsRoverPosition = newMarsRover.getNewMarsRoverPosition();
        int x = newMarsRover.getNewMarsRoverPosition().getX();
        int y = newMarsRover.getNewMarsRoverPosition().getY();
        String direction = newMarsRover.getNewMarsRoverPosition().getDirection();
        Assert.assertEquals(x,0);
    }
}
