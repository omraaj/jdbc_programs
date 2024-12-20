package com.jdbc.createdatabase.firstway;

import java.sql.*;

public class CreateDatabase3 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
     //load the driver
     Class.forName("com.mysql.cj.jdbc.Driver");
     //register driver using drivermanager
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);

        //get connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");

        //create statemnt
        Statement statement = connection.createStatement();
        //execute statemnt
        statement.execute("CREATE DATABASE demo4");

        //process result
        System.out.println("database demo4 created");

        //close the connection
        statement.close();
        connection.close();

        //deregister the driver
        DriverManager.deregisterDriver(driver);
    }
}
