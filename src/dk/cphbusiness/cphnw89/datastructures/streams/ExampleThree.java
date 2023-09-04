package dk.cphbusiness.cphnw89.datastructures.streams;

import java.util.stream.Stream;

public class ExampleThree {

    public static void main(String[] args) {
        Stream<String> words = Stream.of("Jeg", "elsker", "kage", "det", "smager","godt",":)");
        words.map(s ->s+" "+s.length()).forEach(System.out::println);
    }


}
