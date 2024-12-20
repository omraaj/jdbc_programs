package com.jdbc.createdatabase.firstway;

import java.sql.*;

public class CreateDatabase1 {

    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //register the driver
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);

        //get the connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");

        //crate the statement
        Statement statement = connection.createStatement();

        //execute the statement
        statement.execute("CREATE DATABASE Demo2");

        //process the result
        System.out.println("databse created");

        //closing the connection
        statement.close();
        connection.close();

        //deregister the driver
  DriverManager.deregisterDriver(driver);
    }
}
