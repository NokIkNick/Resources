package dk.cphbusiness.cphnw89.resources.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ExampleSevenLazyInvocation {

    private static long counter;

    public static void main(String[] args) {

        /*Intermediate operations are lazy. This means that they will be invoked only if it is necessary for the
        terminal operation execution:*/

        List<String> list = Arrays.asList("abc1","abc2","abc3");
        counter = 0;
        Stream<String> stream = list.stream().filter(element -> {wasCalled(); return element.contains("2");});
        System.out.println(counter);

        /*Its assumed that since we have 3 elements, that the filter() method was called 3 times. But the counter did NOT go up.
         The reason why is, that there is no terminal operation*/

        Optional<String> newStream = list.stream().filter(element -> {
            System.out.println("Filter() was called");
            return element.contains("2");
        }).map(element -> {
            System.out.println("Map() was called");
            return element.toUpperCase();
        }).findFirst();
        /*The filter() method was called twice and the map() method was called once. This is because the pipeline is called vertically.
        * The first element got caught by the filter, the second one went through it, and the third didn't go into the filter and went for the map*/
    }

    private static void wasCalled(){
        counter++;
    }



}
