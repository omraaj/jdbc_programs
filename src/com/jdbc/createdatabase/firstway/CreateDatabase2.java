package com.jdbc.createdatabase.firstway;

import java.sql.*;

public class CreateDatabase2  {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //register the driver
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);

        //get connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");

        //create statement
        Statement statement = connection.createStatement();
        //execute statement
        statement.execute("CREATE DATABASE demo3");

        //process the result in csole
        System.out.println("database zla re create");

        //close the connection
        statement.close();
        connection.close();
        //deregeister thr driver
        DriverManager.deregisterDriver(driver);
    }
}
