package dk.cphbusiness.cphnw89.resources.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AssigmentFourFibonacci {

    public static void main(String[] args) {
        System.out.println("The n of fibonacci is: "+Fibonacci(100));

    }

    public static double Fibonacci(int n){
        List<Double> stream = Stream.iterate(new double[]{0,1}, e -> new double[]{e[1], e[0] + e[1]}).limit(n).parallel().map(e -> e[0]).toList();
        stream.forEach(System.out::println);
        return stream.get(n-1);
    }

}
