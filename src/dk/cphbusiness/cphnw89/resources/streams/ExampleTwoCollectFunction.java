package dk.cphbusiness.cphnw89.resources.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleTwoCollectFunction {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        List<String> result = list.stream().filter(s -> s.contains("a")).collect(Collectors.toList());

        result.stream().forEach(System.out::println);
    }
}
