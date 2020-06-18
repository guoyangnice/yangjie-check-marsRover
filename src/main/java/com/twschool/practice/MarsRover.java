package com.twschool.practice;

public class MarsRover {
    /**
     *
     * @param x 初始位置x
     * @param y 初始位置y
     * @param position 朝向方向
     * @param isMove  是否走一步
     * @return
     *
     */
    public String getPoint(int x, int y,String position,boolean isMove){
        if(isMove && position.equals("N")){
            y++;
        }
        if(isMove && position.equals("S")){
            y--;
        }
        if(isMove && position.equals("W")){
            x--;
        }
        if(isMove && position.equals("E")){
            x++;
        }
        return String.valueOf(x)+"," + String.valueOf(y);
    }

}
