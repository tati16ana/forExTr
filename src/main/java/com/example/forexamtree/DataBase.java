package com.example.forexamtree;

import java.sql.*;

public class DataBase {
    public static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/comfyDent?userSSL=false";
    public static final String DATABASE_USERNAME = "root";
    public static final String DATABASE_PASSWORD = "1234";

    public static final String SELECT_QUERY = "SELECT * FROM `employee` WHERE login = ? and password = ?";

    public boolean validate (String login, String password) throws SQLException{
        Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY);
        preparedStatement.setString(1, login);
        preparedStatement.setString(2, password);

        System.out.println(preparedStatement);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()){
            connection.close();
            return true;
        }
        else{
            connection.close();
            return false;
        }
    }
}
