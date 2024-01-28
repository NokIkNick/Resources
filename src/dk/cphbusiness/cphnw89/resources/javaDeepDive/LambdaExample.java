package dk.cphbusiness.cphnw89.resources.javaDeepDive;

public class LambdaExample {
    public static void main(String[] args){
        Cat myCat = new Cat();
        //myCat.print();
        //printMyThing(myCat);
        printMyThing((prefix ,suffix) -> {
            return prefix+ " Meow " + suffix;
        });

        Printable myPrintable = (prefix, suffix) -> prefix+" Meow " + suffix;
        printMyThing(myPrintable);
    }

    static void printMyThing(Printable thing){
        String printString = thing.print("loud","!");
        System.out.println(printString);
    }
    
}
