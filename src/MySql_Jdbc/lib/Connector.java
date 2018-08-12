package MySql_Jdbc.lib;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Connector {

    private static final String DB = "jdbc:mysql://localhost:3306/signin";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private static final Connection CONNECT = null;

    public static Connection connectDB() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection(DB, USERNAME, PASSWORD);
            System.out.println("Connected!");
            connect.close();
            return connect;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);

        }

        CONNECT.close();
        return null;

    }

}
