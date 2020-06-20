package cm.twschool.guessnumber;

import java.util.Random;

/**
 * 生成随机数
 */
public class Generator {
    static String temp="";

    public String generaotrRondomNumber(){
        Random r = new Random(1);
        String randomNumberStr = "";
        while(randomNumberStr.length() < 4){
            int ran = r.nextInt(10);
            String ranStr = String.valueOf(ran);
            if(!randomNumberStr.contains(ranStr)){
                randomNumberStr += ranStr;
                temp += ranStr + " ";
            }
        }
        return temp;
    }
}
