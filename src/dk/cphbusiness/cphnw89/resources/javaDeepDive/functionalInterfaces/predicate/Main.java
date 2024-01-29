package dk.cphbusiness.cphnw89.resources.javaDeepDive.functionalInterfaces.predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;


public class Main {

    public static void main(String[] args) {
        Predicate<Integer> divisibleBy7 = (a) -> {
            if(a%7 == 0){
                return true;
            }else return false;
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(30);
        nums.add(46);
        nums.add(77);
        nums.add(20);

        List<Integer> result = predicate(nums, divisibleBy7);
        result.forEach(System.out::println);
    }



    public static List<Integer> predicate(List<Integer> a, Predicate<Integer> pr){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < a.size(); i++){
            if(pr.test(a.get(i))){
                result.add(i);
            }
        }
        return result;
    }

}

