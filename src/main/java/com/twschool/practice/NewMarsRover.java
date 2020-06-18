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
        switch (command){
            case "L":
                newMarsRoverPosition =  turnLeft(newMarsRoverPosition);
                break;
            case "R":
                newMarsRoverPosition =  turnLeft(newMarsRoverPosition);
                break;
            case "M":
                newMarsRoverPosition =  move(newMarsRoverPosition);
                break;
        }
        return newMarsRoverPosition;
    }

    private NewMarsRoverPosition turnRight(NewMarsRoverPosition position) {
        String dir = position.getDirection();
        int index = directions.indexOf(dir);
        switch(index){
            case 0:
                position.setDirection(String.valueOf(directions.charAt(3)));
                break;
            case 1:
            case 2:
            case 3:
                position.setDirection(String.valueOf(directions.charAt(index-1)));
                break;
        }
        return position;
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

    private NewMarsRoverPosition move(NewMarsRoverPosition position) {
        switch (position.getDirection()){
            case ("N"):
                position.setY(position.getY()+1);
                break;
            case ("S"):
                position.setY(position.getY()-1);
                break;
            case ("W"):
                position.setX(position.getX()-1);
                break;
            case ("E"):
                position.setX(position.getX()+1);
                break;
        }
        return position;
    }
}
