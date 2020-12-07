package PostgreSQL;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class QueryTool {

    private static final String create = "CREATE TABLE IF NOT EXISTS %s(id serial, %s, PRIMARY KEY(id));";
    private static final String drop = "DROP TABLE IF EXISTS %s";

    private static final String audience = "Audience";
    private static final String computerAudience = "computerAudience";
    private static final String lectureAudience = "lectureAudience";

    private static final String audience_create_attribute = "name varchar(20), number int4, square real";
    private static final String computerAudience_create_attribute = audience_create_attribute + ", countOfComputer int4";
    private static final String lectureAudience_create_attribute = audience_create_attribute + ", projector int4";

    private static void Execute(String query) throws SQLException {
        Connection connection = Connector.Connect();
        if (connection != null) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            Connector.Disconnect(connection);
        }
    }

    public static void createAudience() throws SQLException {
        Execute(String.format(create, audience, audience_create_attribute));
    }
    public static void createComputerAudience() throws SQLException {
        Execute(String.format(create , computerAudience, computerAudience_create_attribute));
    }
    public static void createLectureAudience() throws SQLException {
        Execute(String.format(create, lectureAudience, lectureAudience_create_attribute));
    }

    public static void dropAudience() throws SQLException {
        Execute(String.format(drop, audience));
    }
    public static void dropComputerAudience() throws SQLException {
        Execute(String.format(drop, computerAudience));
    }
    public static void dropLectureAudience() throws SQLException {
        Execute(String.format(drop, lectureAudience));
    }
}
