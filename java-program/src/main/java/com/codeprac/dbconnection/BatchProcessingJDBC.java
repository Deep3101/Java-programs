package com.codeprac.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcessingJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root442","Deep@123");

        connection.setAutoCommit(false);
        PreparedStatement pst = connection.prepareStatement("insert into employee(id, name, email) values(?,?,?)");

        for (int i = 0; i <= 1000; i++){
            pst.setInt(1, i);
            pst.setString(2,"Employee "+i);
            pst.setString(3,"Employee "+"@gmail.com" + i);
            pst.addBatch();
        }

        pst.executeBatch();

        pst.close();
        connection.close();
    }
}
