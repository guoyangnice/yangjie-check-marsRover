package com.twschool.practice;

public class NewMarsRoverPosition {
    private int x;
    private int y;
    private String direction;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public NewMarsRoverPosition(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

}
