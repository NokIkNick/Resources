package dk.cphbusiness.cphnw89.datastructures.streams;

import java.util.stream.Stream;

public class ExampleOne {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        long count = stream.distinct().count();
        System.out.println(count);
    }
}
