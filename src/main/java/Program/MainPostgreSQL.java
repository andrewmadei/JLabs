package Program;

import java.sql.SQLException;
import PostgreSQL.*;

public class MainPostgreSQL {
    public static String pause() {
        System.out.println("Press Any Key To Continue...");
        return new java.util.Scanner(System.in).nextLine();
    }

    public static void main(String[] argv) {
        try {
            QueryTool.dropAudience();
            QueryTool.dropComputerAudience();
            QueryTool.dropLectureAudience();

            pause();

            QueryTool.createAudience();
            QueryTool.createComputerAudience();
            QueryTool.createLectureAudience();
        }
        catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

    }
}
