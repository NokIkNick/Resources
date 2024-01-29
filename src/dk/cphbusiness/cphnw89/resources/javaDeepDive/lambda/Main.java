package dk.cphbusiness.cphnw89.resources.javaDeepDive.lambda;

public class Main {
    public static void main(String[] args){

        ArithmeticOperation addition = (a, b) -> Math.addExact(a,b);
        ArithmeticOperation subtraction = (a, b) -> Math.subtractExact(a,b);
        ArithmeticOperation multiplier = (a,b) -> Math.multiplyExact(a,b);
        ArithmeticOperation division = (a,b) -> Math.divideExact(a,b);
        ArithmeticOperation modulus = (a,b) -> a%b;
        ArithmeticOperation power = (a,b) -> a^b;


        int resultAdd = operate(1,2,addition);
        int resultSub = operate(1,2,subtraction);
        int resultMulti = operate(1,2,multiplier);
        int resultDivide = operate(1,2,division);
        int resultMod = operate(1,2, modulus);
        int resultPow = operate(1,2,power);

        System.out.println(resultAdd);
        System.out.println(resultSub);
        System.out.println(resultMulti);
        System.out.println(resultDivide);
        System.out.println(resultMod);
        System.out.println(resultPow);

        System.out.println("----------------------------------------------------------------------");

        int[] aNums = {
                2,
                5,
                7,
                8,
                12,
                40
        };

        int[] bNums = {
                6,
                4,
                8,
                12,
                60,
                50
        };

        int[] arithResults = operate(aNums,bNums,addition);

        for (int res : arithResults) {
            System.out.println(res);
        }

        System.out.println("----------------------------------------------------------------------");

    }

    public static int operate(int a, int b, ArithmeticOperation aO){
        return aO.perform(a,b);
    }

    public static int[] operate(int[] a, int[] b, ArithmeticOperation aO){
        int[] results = new int[a.length];
        for (int i = 0; i < results.length; i++){
            results[i] = aO.perform(a[i],b[i]);
        }
        return results;
    }

}
