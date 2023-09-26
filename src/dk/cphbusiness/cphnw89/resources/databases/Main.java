package dk.cphbusiness.cphnw89.resources.databases;

public class Main {


    private final static String USER = "postgres";
    private final static String PASSWORD = "postgres";

    private final static String URL ="jdbc:postgresql:bibliotek";
    private static Database db;

    public static void main(String[] args) {

        try {
            Database db = new Database(USER,PASSWORD,URL);
        }catch(Exception e){
            System.out.println("Error has occurred");
        }

    }


}
