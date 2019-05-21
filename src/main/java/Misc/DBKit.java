package Misc;

import java.sql.*;
import java.util.Properties;

public class DBKit {
    private static String driver_class_name = "com.mysql.jdbc.Driver";
    private static String connection_url = "jdbc:mysql://.../PaipaiStoreDB";
    private static String user_name = "123";
    private static String password = "123";
    private static String format_keyword = "|";

    static {
        try {
            Class.forName(driver_class_name);
            Properties properties = new Properties();
            properties.load(DBKit.class.getClassLoader().getResourceAsStream("/conf/database.conf"));
            setDriver_class_name(properties.getProperty("driver_class_name"));
            setConnection_url(properties.getProperty("connection_url"));
            setUser_name(properties.getProperty("user_name"));
            setPassword(properties.getProperty("password"));
            setFormat_keyword(properties.getProperty("format_keyword"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn() throws SQLException {
        Connection connection = DriverManager.getConnection(connection_url, user_name, password);
        return connection;
    }

    public static void closeAll(Connection con, Statement sta, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (sta != null) {
            try {
                sta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getDriver_class_name() {
        return driver_class_name;
    }

    public static void setDriver_class_name(String driver_class_name) {
        DBKit.driver_class_name = driver_class_name;
    }

    public static String getConnection_url() {
        return connection_url;
    }

    public static void setConnection_url(String connection_url) {
        DBKit.connection_url = connection_url;
    }

    public static String getUser_name() {
        return user_name;
    }

    public static void setUser_name(String user_name) {
        DBKit.user_name = user_name;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        DBKit.password = password;
    }

    public static String getFormat_keyword() {
        return format_keyword;
    }

    public static void setFormat_keyword(String format_keyword) {
        DBKit.format_keyword = format_keyword;
    }
}