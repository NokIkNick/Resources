package dk.cphbusiness.cphnw89.resources.testEnvironment;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("Hello"));

        long number = 54321;
        System.out.println(Arrays.toString(digitize(number)));

    }

    public static String solution(String str){
        String output = "";
        for(int i = str.length()-1; i > -1; i--){
            output += str.charAt(i);
        }
        return output;
    }

    public static int[] digitize(long n) {
        if(n > 0){
            String number = Long.toString(n);
            String[] numbers = number.split("");
            String[] revNumbers = new String[numbers.length];
            for(int i = 0; i < numbers.length; i++){
                revNumbers[i] = numbers[numbers.length-1-i];
            }
            int[] output = new int[revNumbers.length];
            for(int i = 0; i < revNumbers.length; i++){
                output[i] = Integer.parseInt(revNumbers[i]);
            }
            return output;
        }else {
            return new int[]{0};
        }
    }

}
