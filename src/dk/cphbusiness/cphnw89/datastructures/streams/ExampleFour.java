package dk.cphbusiness.cphnw89.datastructures.streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class ExampleFour {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> stream = in.lines();
        List<String> out = stream.filter(s-> s.length() > 5).limit(5).toList();
        out.stream().forEach(System.out::println);
    }
}
