package dk.cphbusiness.cphnw89.resources.testEnvironment;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("Hello"));

        long number = 54321;
        System.out.println(Arrays.toString(digitize(number)));

        System.out.println(past(0,1,1));


        System.out.println(betterThanAverage(new int[] {100,90},11));

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


    public static int past(int h, int m, int s){
        if(0 <= h && h <= 23 && 0 <= m && m <= 59 && 0<= s && s <= 59){
            int hours = h*60;
            int min = (hours + m)*60;
            int sec = (min+s)*1000;
            int result = sec;
            return result;
        }
        return 0;
    }


    public static boolean betterThanAverage(int[] classPoints, int yourPoints){
        int[] allPoints = new int[classPoints.length+1];
        for(int i = 0; i < classPoints.length-1; i++){
            allPoints[i] = classPoints[i];
        }
        allPoints[allPoints.length-1] = yourPoints;
        OptionalDouble result = Arrays.stream(allPoints).average();
        if(result.isPresent()){
            if(result.getAsDouble() > yourPoints){
                return false;
            }else {
                return  true;
            }
        }
        return false;
    }


}
