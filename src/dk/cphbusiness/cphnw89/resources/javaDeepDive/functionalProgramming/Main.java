package dk.cphbusiness.cphnw89.resources.javaDeepDive.functionalProgramming;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyTransformingType multiply = (a) -> a*2;

        MyValidatingType validate = (a) -> {
            if(a%3 == 0){
                return true;
            }else return false;
        };

        int[] integers = {
                1,
                4,
                6,
                9,
                10,
                40
        };

        int[] results = map(integers, multiply);

        System.out.println("---------------------------------------------");

        int[] results2 = filter(integers, validate);

        for (int i :results2) {
            System.out.println(i);
        }
    }

    public static int[] map(int[]a , MyTransformingType type){
        int[] result = new int[a.length];
        for(int i = 0; i < a.length; i++){
            result[i] = type.transform(a[i]);
            System.out.println(result[i]);
        }
        return result;
    }

    public static int[] filter(int[] a, MyValidatingType type){
        int[] result = new int[a.length];
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(type.validate(a[i])){
                result[count] = a[i];
                count++;
            }
        }
        return Arrays.copyOf(result,count);
    }
}
