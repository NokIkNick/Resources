package dk.cphbusiness.cphnw89.resources.streams;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ExampleOneStreamCreation {
    public static void main(String[] args) {
        //BASIC STREAM CREATION:
        Stream<Integer> stream = Stream.of(1,2,3,4,5); //We can make streams of any generic.
        long count = stream.distinct().count(); //Count returns the size of the stream.
        System.out.println(count);

        //STREAMS FROM ANY COLLECTION:
        Collection<String> collection = Arrays.asList("a", "b", "c"); //We can make streams of any collection, list or set.
        Stream<String> streamOfCollection = collection.stream();
        streamOfCollection.forEach(System.out::println);

        //STREAMS FROM ARRAYS:
        Stream<String> streamOfArray = Stream.of("a", "b", "c"); //An array can also be the source of a stream.

        String[] arr = new String[]{"a","b","c"}; //We can also create a stream out of an existing array.
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3); //Or a part of it.

        //BUILDER() FUNCTION:
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build(); //Important to note, that the desired type should be
        // additionally specified in the right part of the statement, otherwise the build() method will create an instance of the Stream<Object>

        //GENERATE() FUNCTION:
        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10); //Generates an infinite to memory limit stream, that requires
        // a limit to stop. This generates a sequence of ten strings with the value "element".

        //ITERATE() FUNCTION:
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n +2).limit(20); //The first element of the resulting stream
        //is the first parameter in the method. The lambda function / anonymous inner class, is applied to the previous element and turned into the next one.

        //STREAM OF PRIMITIVES
        IntStream intStream = IntStream.range(1,3); //Creates ordered stream from the first parameter to the second. Does not include the last parameter.
        LongStream longStream = LongStream.rangeClosed(1,3); //Does the same as the above, but the last parameter is included.
        DoubleStream doubleStream = DoubleStream.of(2.0,4.0);

        Random random = new Random();
        DoubleStream rndDoubleStream = random.doubles(3); //Creates a doubleStream with 3 elements.

        //STREAM OF STRING:
        IntStream streamOfChars = "abc".chars(); //Creates a stream of ints, representing the ASCII code for the chars.
        Stream<String> streamOfString = Pattern.compile(",").splitAsStream("a, b, c"); //Breaks a string into sub-strings.

        //STREAM OF FILE:
        Path path = Paths.get("C:\\file.txt");
        try{
            Stream<String> streamOfStrings = Files.lines(path); //Every line of text becomes an element of the stream.
            Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));
        }catch(Exception e){
            System.out.println(e);
        }

    }


    //Stream<String> streamEmpty = Stream.empty(); //Creates an empty Stream, used to avoid returning null for streams with no element:
    public Stream<String> streamOf(List<String> list){
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

}
