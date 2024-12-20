package com.jdbc.createdatabase.firstway;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase6 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
         Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
        Statement statement = connection.createStatement();
        statement.execute("CREATE DATABASE firstway6");

        statement.close();
        connection.close();
        DriverManager.deregisterDriver(driver);


    }
}
