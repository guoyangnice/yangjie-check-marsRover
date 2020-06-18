package com.twschool.practice;

public class NewMarsRover {

    private NewMarsRoverPosition newMarsRoverPosition = new NewMarsRoverPosition();
    private String directions = "NWSE";

    public NewMarsRover(int x, int y, String direction){
        newMarsRoverPosition.setDirection(direction);
        newMarsRoverPosition.setX(x);
        newMarsRoverPosition.setY(y);
    }

    public NewMarsRoverPosition exeute(String command) {
        if(command.length() < 1){
            return newMarsRoverPosition;
        }
        if(command.equals("L")){
            return turnLeft(newMarsRoverPosition);
        }
        return newMarsRoverPosition;
    }

    private NewMarsRoverPosition turnLeft(NewMarsRoverPosition position) {
        String dir = position.getDirection();
        int index = directions.indexOf(dir);
        switch(index){
            case 0:
            case 1:
            case 2:
                position.setDirection(String.valueOf(directions.charAt(index+1)));
                break;
            case 3:
                position.setDirection(String.valueOf(directions.indexOf(0)));
                break;
        }
        return position;
    }
}
