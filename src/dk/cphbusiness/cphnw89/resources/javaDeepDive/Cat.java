package dk.cphbusiness.cphnw89.resources.javaDeepDive;

public class Cat implements Printable{

    public String name;
    public int age;

    public Cat(){

    }

    public String print(String p, String s){
        return p+" Meow "+ s;
    }

}
