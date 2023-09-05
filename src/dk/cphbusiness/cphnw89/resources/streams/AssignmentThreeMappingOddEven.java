package dk.cphbusiness.cphnw89.resources.streams;

import java.util.Random;
import java.util.stream.Stream;

public class AssignmentThreeMappingOddEven {
    public static void main(String[] args) {

        //CONVERT TO LIST AFTER
        Stream<Integer> stream = Stream.of(2,5,7,1,8,9,20,11);
        Stream<String> list = stream.map(s-> s % 2 == 0 ? "lige":"ulige");
        list.toList().forEach(System.out::println);

        Random rnd = new Random();
        Stream<Integer> ints = list.map(s-> s.equals("lige") ? rnd.nextInt(50) * 2 + 2 : rnd.nextInt(50) * 1 + 1);
        ints.toList().forEach(System.out::println);



    }
}
