package com.jdbc.createdatabase.secondway;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import  java.sql.Statement;
import  java.sql.Connection;



public class CreateDatabase5 {

    private static  Driver driver;
    private static  Connection connection;
    private  static  Statement statement;
    private static String query;

    public static void main(String[] args) {
           try{
               openConnection();
               statement=connection.createStatement();
               query="CREATE DATABASE secondway6";
               statement.execute(query);
               System.out.println("database is created");
   }catch (ClassNotFoundException | SQLException e){
                   e.printStackTrace();
           }finally {
               try{
                   closeConnection();
               }
               catch (SQLException e){
                   e.printStackTrace();
               }
           }


    }



    private static  void openConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        driver= new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");

    }

    private  static  void closeConnection() throws SQLException{
        if(statement!=null);
        statement.close();
        if(connection!=null);
        connection.close();
        if(driver!=null);
        DriverManager.deregisterDriver(driver);
    }




}