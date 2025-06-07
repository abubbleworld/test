package org.example.jdbc;

import java.sql.*;

public class JdbcDemo {
    public static void main() {
        String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=Asia/Shanghai";
        String user = "root";
        String password = "shxg9252";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            String sql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                var userName = rs.getString("name");
                System.out.println("username: " + userName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
