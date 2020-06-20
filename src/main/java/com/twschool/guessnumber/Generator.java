package com.twschool.guessnumber;

import java.util.Random;

/**
 * 生成随机数
 */
public class Generator {
    public void generaotrRondomNumber(){
        Random r = new Random(1);
        String randomNumber = "";
        while(randomNumber.length() < 4){
            int ran = r.nextInt(10);
            String ranStr = String.valueOf(ran);
            if(!randomNumber.contains(ranStr)){
                randomNumber.concat(ranStr);
            }
        }
    }
}
