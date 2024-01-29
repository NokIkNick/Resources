package dk.cphbusiness.cphnw89.resources.javaDeepDive.functionalInterfaces.supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        String[] names = {
                "John",
                "Jane",
                "Jack",
                "Joe",
                "Jill"
        };

        Supplier<Employee> employeeSupplier = () -> {
            return new Employee(names[random.nextInt(0,5)]);
        };

        List<Employee> result = generateEmployees(10,employeeSupplier);
        for (Employee e: result) {
            System.out.println(e.getName());
        }

    }

    public static List<Employee> generateEmployees(int amount, Supplier<Employee> supp){
        List<Employee> employees = new ArrayList<>();
        for(int i = 0; i < amount; i++){
            Employee person = supp.get();
            employees.add(person);
        }
        return employees;
    }
}
