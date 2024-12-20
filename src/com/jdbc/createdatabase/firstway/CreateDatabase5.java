package com.jdbc.createdatabase.firstway;

import java.sql.*;

public class CreateDatabase5 {
    public static void main(String[] args)  throws ClassNotFoundException, SQLException {

        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //register the driver
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);

        //create connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");

        //create statement
        Statement statement = connection.createStatement();
        //execute the statement
        statement.execute("CREATE DATABASE demo6");
        //close the connection
        statement.close();
        connection.close();
        //deregister the driver
        DriverManager.deregisterDriver(driver);

    }
}
