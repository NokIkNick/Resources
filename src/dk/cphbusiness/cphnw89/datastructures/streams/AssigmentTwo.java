package dk.cphbusiness.cphnw89.datastructures.streams;

import java.util.stream.Stream;

public class AssigmentTwo {
    public static void main(String[] args) {

        Stream<String> words = Stream.of("Jeg", "elsker", "kage", "det", "smager","godt",":)");
        String reduced = words.reduce((a , b) -> a +" "+ b).get();
        //String reduced = words.reduce("",(a , b) -> a +" "+ b).trim();
        System.out.println(reduced);

    }
}
