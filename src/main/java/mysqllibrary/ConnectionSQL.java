package mysqllibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Сonnection class
 */
public class ConnectionSQL {
    private static final String URL = "jdbc:mysql://localhost:3306/courses_dump_skillbox";
    private static final String USE = "root";
    private static final String PASSWORD = "Vb[fcbr16331";

    public Statement connectionSQL() {
        Statement statement;
        try {
            Connection connection = DriverManager.getConnection(URL, USE, PASSWORD);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return statement;
    }
}
