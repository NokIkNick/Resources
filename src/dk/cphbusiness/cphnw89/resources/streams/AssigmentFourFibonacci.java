package dk.cphbusiness.cphnw89.resources.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AssigmentFourFibonacci {

    public static void main(String[] args) {
        System.out.println(Fibonacci(10));

    }

    public static int Fibonacci(int n){
        List<Integer> stream = Stream.iterate(new int[]{0,1}, e -> new int[]{e[1], e[0] + e[1]}).limit(n).parallel().map(e -> e[0]).toList();
        stream.forEach(System.out::println);
        return stream.get(n-1);
    }

}
