
// Import Class & Package.
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class JDBC {
    // Variable Declaration.
    static String URL = "jdbc:mysql://localhost:3306/university";
    static String NAME = "root";
    static String PASS = "kapil";

    // Create Own Method To Give Connection For All Classes.
    public static Connection jdbcgetConnection() throws SQLException {
        return DriverManager.getConnection(URL,NAME,PASS);
    }
}
