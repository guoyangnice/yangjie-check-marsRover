package com.twschool.practice;

public class NewMarsRover {

    private NewMarsRoverPosition newMarsRoverPosition = new NewMarsRoverPosition();

    public NewMarsRover(int x, int y, String direction){
        newMarsRoverPosition.setDirection(direction);
        newMarsRoverPosition.setX(x);
        newMarsRoverPosition.setY(y);
    }

    public NewMarsRoverPosition exeute(String command) {
        if(command.length() < 1){
            return newMarsRoverPosition;
        }
        return newMarsRoverPosition;
    }
}
