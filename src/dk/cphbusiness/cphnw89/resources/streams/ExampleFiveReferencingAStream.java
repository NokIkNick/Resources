package dk.cphbusiness.cphnw89.resources.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleFiveReferencingAStream {
    public static void main(String[] args) {

        //REFERENCING A STREAM:
        /*We can instantiate a stream, and have an accessible reference to it, as long as only intermediate operations
        * are called. Executing a terminal operation makes a stream inaccessible. To demonstrate this, we will forget
        * for a while that the best practice is to chain the sequence of operation. Besides, its unnecessary verbosity
        * technically the following code is valid:*/
        Stream<String> stream = Stream.of("a","b","c").filter(element -> element.contains("b"));
        Optional<String> anyElement = stream.findAny();

        /*However, an attempt to reuse the same reference after calling the terminal operation will trigger the
        * IllegalStateException:*/

        Optional<String> firstElement = stream.findFirst(); //This does NOT work. JAVA 8 STREAMS CANNOT BE REUSED.

        /*To fix this, we got to save the content from the stream in a collection to be accessed further:*/
        List<String> elements = Stream.of("a","b","c").filter(element -> element.contains("b")).collect(Collectors.toList());
        Optional<String> anyElement2 = elements.stream().findAny();
        Optional<String> firstElement2 = elements.stream().findFirst();

    }
}
