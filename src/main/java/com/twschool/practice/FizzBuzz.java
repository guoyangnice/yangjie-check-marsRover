package com.twschool.practice;

public class FizzBuzz {
    public String say(int number){

        if(String.valueOf(number).contains("3")){
            return "Fizz";
        }

        //第三部分
        if(number % 3 % 5 % 7 == 0) {
            return "FizzBuzz";
        }

        //第二部分
        if(number % 3 % 5 == 0){
            return "FizzBuzz";
        }

        if(number % 5 % 7 == 0){
            return "BuzzFizz";
        }

        if(number % 3 % 7 == 0){
            return "FizzWhizz";
        }

        //第一部分
        if(number == 1) {
            return "1";
        }
        if(number == 3) {
            return "Fizz";
        }
        if(number == 5) {
            return "Buzz";
        }
        if(number == 7) {
            return "Whizz";
        }

        return String.valueOf(number);

    }
}
