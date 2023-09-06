package dk.cphbusiness.cphnw89.resources.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleEightParallelStreams {

    public static void main(String[] args) {
        IntStream stream = IntStream.range(1,100).parallel();
        stream.map(x -> x*x).forEach(System.out::println);

        Stream<String> stream2 = IntStream.rangeClosed(1,100).mapToObj(x->"a"+x);
        List<String> list = stream2.parallel().collect(Collectors.toList());
        list.stream().forEach(System.out::println);
    }

}
