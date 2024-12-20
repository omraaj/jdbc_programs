package com.jdbc.createdatabase.firstway;

import java.sql.*;

public class CreateDatabase4 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //register the driver
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        //open connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");

        //create statement
        Statement statement = connection.createStatement();
        //execute statement
        statement.execute("CREATE DATABASE demo5");
        //print in console
        System.out.println("demo5 database is created");
        //closing the connection
        statement.close();
        connection.close();
        //deregister the driver
        DriverManager.deregisterDriver(driver);
    }
}
