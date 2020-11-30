package org.example;

public class RealFizzBuzzP2 {
    public static void main(String[] args)
    {
        System.out.println(fizzBuzz(1, 20));
    }

    static String fizzBuzz(int start, int end){
        String output = "";
        for(int i = start; i <= end; i++){
            output += checkNumber(i) + " ";
        }
        return output;
    }

    static String checkNumber(int number){
        if(Integer.toString(number).contains("3")){
            return "lucky";
        }else if(evenlyDivisible(number, 15)){
            return "fizzbuzz";
        }else if(evenlyDivisible(number, 5)){
            return "buzz";
        }else if(evenlyDivisible(number, 3)){
            return "fizz";
        }else{
            return Integer.toString(number);
        }
    }

    static boolean evenlyDivisible(int dividend, int divisor){
        return dividend % divisor == 0;
    }

}