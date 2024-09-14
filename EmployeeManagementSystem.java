import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeManagementSystem {
    // Replace "YourServerName" with your actual server name
    private static final String DB_URL = "jdbc:sqlserver://MSI;databaseName=EmployeeManagementSystem";
    private static final String USER = "MSI\'YASARA";
    private static final String PASS = "your_password";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Register JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Connected to database successfully...");
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block used to close resources
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
