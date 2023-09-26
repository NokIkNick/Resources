package dk.cphbusiness.cphnw89.resources.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {

    private Connection connection;
    private final String USER;
    private final String PASSWORD;
    private final String URL;

    public Database(String user, String password, String url){
        this.USER = user;
        this.PASSWORD = password;
        this.URL = url;
        try {
            Class.forName("org.postgresql.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Error instantiating Driver Class");
        }
    }


    public Connection connect(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
        }catch(SQLException throwables){
            throwables.printStackTrace();
            System.out.println("Error connecting to database.");
        }
        return connection;
    }

}
