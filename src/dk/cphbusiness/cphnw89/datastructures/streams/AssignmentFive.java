package dk.cphbusiness.cphnw89.datastructures.streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class AssignmentFive {
    public static void main(String[] args) {
        Stream<String> inStream = new BufferedReader(new InputStreamReader(System.in)).lines();
        List<String> out = inStream.filter(s-> isInt(s)? Integer.parseInt(s) % 2 == 1: false).limit(5).toList();
        out.stream().forEach(System.out::println);

        /* //OGSÅ KORREKT
        inStream.map(Integer::parseInt).filter(i -> i % 2 == 1).limit(5).forEach(System.out::println);
        inStream.filter(AssignmentFive::isInt).map(Integer::parseInt).filter(i -> i%2 == 1).limit(5).forEach(System.out::println);
        */
    }

    public static boolean isInt(String s){
        try{
            Integer.parseInt(s);
        }catch(Exception e){
            return false;
        }
        return true;
    }
}
