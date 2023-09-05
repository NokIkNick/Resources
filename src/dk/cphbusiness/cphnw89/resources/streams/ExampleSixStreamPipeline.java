package dk.cphbusiness.cphnw89.resources.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleSixStreamPipeline {
    public static void main(String[] args) {

        /*To perform a sequence of operations over the lements of the data source, and aggregate their results, we need
        * three parts: The source, intermediate operation(s), and a terminal operation.*/

        /*Intermediate operations return a new modified stream. For example, to create a new stream of the existing
        * one without few elements, the skip() method should be used:*/

        Stream<String> onceModifiedStream = Stream.of("abdc","bbcd","cbcd").skip(1);

        /*If we need more than one modification, we can chain the intermediate operations:*/

        Stream<String> twiceModifiedStream = onceModifiedStream.skip(1).map(element -> element.substring(0,3));

        /*The correct and most convenient way to use streams is by a stream pipeline, which is a chain of the stream source,
        * intermediate operations, and a terminal operation:*/

        List<String> list = Arrays.asList("abc1","abc2","abc3");
        long size = list.stream().skip(1).map(element -> element.substring(0,3)).sorted().count();
        System.out.println(size);

    }
}
