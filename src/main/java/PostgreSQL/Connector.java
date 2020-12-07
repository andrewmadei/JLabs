package PostgreSQL;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Connector {

    private static final String DB_URL = "jdbc:postgresql://127.0.0.1:5234/JavaDB";
    private static final String USER = "java";
    private static final String PASS = "12345";

    public static Connection Connect() throws SQLException{

        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBS Driver is not found!");
            return null;
        }

        Connection connection = null;
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
        if (connection == null)
            System.out.println("You haven\'t connected to database");
        return connection;
    }

    public static void Disconnect(Connection connection) throws SQLException {
        connection.close();
    }
}
