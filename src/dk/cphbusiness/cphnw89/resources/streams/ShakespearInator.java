package dk.cphbusiness.cphnw89.resources.streams;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ShakespearInator {

    private static int zeCounter;

    public static void main(String[] args) {
        zeCounter = 0;
        Path path = Paths.get("C:\\Users\\nickl\\Desktop\\GitHub\\Resources\\doc\\textFiles\\theSonnets.txt");
        Path path1 = Paths.get("C:\\Users\\nickl\\Desktop\\GitHub\\Resources\\doc\\textFiles\\testSet.txt");
        try{
            Stream<String> streamOfLines = Files.lines(path).parallel()
                    .flatMap(e -> Arrays.stream(e.replace("?","")
                            .replace("!","")
                            .replace(",","")
                            .replace(".","")
                            .replace(";","")
                            .replace(":","")
                            .replace("(","")
                            .replace(")","")
                            .replace("{","")
                            .replace("}","")
                            .replace("[","")
                            .replace("]","")
                            .replace("\"","")
                            .replace("\"","")
                            .toUpperCase()
                            .trim()
                            .split(" ")))
                    .distinct().parallel().
                    sorted(); //Every line of text becomes an element of the stream.
            List<String> words = streamOfLines.toList();
            words.forEach(System.out::println);
            System.out.println("Individual distinct words: "+words.size());
            //Stream<String> streamOfWordsAndCount = Stream.of(words);



        }catch(Exception e){
            System.out.println(e);
        }
    }




}
