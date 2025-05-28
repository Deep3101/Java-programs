package com.codeprac.dbconnection;

import java.sql.*;

public class DbConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //load jdbc driver class name
        Class.forName("com.mysql.cj.jdbc.Driver");

        //create a connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root442","Deep@123");

        //create a statement
        Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from classicmodels where id = ?");
        preparedStatement.setInt(1, 1);
        //execute the query
        ResultSet resultSet = statement.executeQuery("select  * from classicmodels");

        //process the results
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }

        //closing the connection
        resultSet.close();
        statement.close();
        connection.close();

    }
}
