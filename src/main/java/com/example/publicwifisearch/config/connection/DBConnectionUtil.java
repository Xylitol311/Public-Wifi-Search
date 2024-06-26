package com.example.publicwifisearch.config.connection;


import java.sql.*;

import static com.example.publicwifisearch.config.connection.ConnectionConst.URL;

public class DBConnectionUtil {
    public static Connection getConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection(URL);
            return connection;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            if (pstmt != null && !pstmt.isClosed()) {
                pstmt.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
