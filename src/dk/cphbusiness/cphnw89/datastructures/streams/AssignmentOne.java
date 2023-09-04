package dk.cphbusiness.cphnw89.datastructures.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AssignmentOne {
    //Tag liste af navne, og filter og collect alle navnene der indeholder et lille "e".
    public static void main(String[] args) {
        List<String> allNames = new ArrayList<>(); //Stream names = Stream.of("navne"); Is the same.
        allNames.add("Jørgen");
        allNames.add("Peter");
        allNames.add("Svend");
        allNames.add("Gertrud");
        allNames.add("Signe");
        allNames.add("Tobias");
        allNames.add("Karsten");
        allNames.add("Gurli");
        allNames.add("Bella");
        allNames.add("Ursula");
        allNames.add("Gertrud");

        List<String> names = allNames.stream().distinct().filter(s -> s.contains("e")).toList();
        names.stream().forEach(System.out::println);

    }

}
