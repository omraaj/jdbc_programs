package com.jdbc.createdatabase.firstway;

import java.sql.*;
import  java.sql.Statement;
  // to run all of these programs first add jar file of mysql connector
public class CreateDataBase {

    public static void main(String[] args) throws  ClassNotFoundException, SQLException {

          //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //register the driver
         Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);

        //get the connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");

        //create the statement
        Statement statement =connection.createStatement();

        //execute the statement
        statement.execute("CREATE DATABASE demo1");


        //process the result
        System.out.println("database created");

        //close the connectionn
        statement.close();
        connection.close();

        //deregister the drive
        DriverManager.deregisterDriver(driver);

    }
}
