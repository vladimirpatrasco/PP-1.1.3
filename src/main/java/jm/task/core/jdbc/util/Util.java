package jm.task.core.jdbc.util;

import com.mysql.cj.jdbc.ConnectionImpl;
import org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionCreator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class Util {

    public static Connection getCon() {
        String userName = "root";
        String password = "123qwerty";
        String url = "jdbc:mysql://localhost:3306/database";

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, userName, password);
            connection.setAutoCommit(false);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
