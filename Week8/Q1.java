package Week8;

import java.sql.*;

public class Q1 {

    public static class DBException extends Exception {
        public DBException(String message) {
            super(message);
        }
    }

    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

//    private static final Logger logger = Logger.getLogger(Q1.class);

    public static void main(String[] args) throws DBException {
        //Establishing a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)) {
//            logger.info("Connection established: " + conn);
//            System.out.println("You shouldn't see this message!");

            //Executing a query
            String query = "SELECT * FROM student";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
//            System.out.println(rs);

            //Retrieving the data from resultSet
            while (rs.next())
            {
                int id = rs.getInt("student_id");
                String name = rs.getString("name");
                String major = rs.getString("major");

                // print the results
                System.out.format("%s, %s, %s\n", id, name, major);
            }
        }
        catch (SQLException e) {
//            logger.error("Error connecting to database: " + e.getMessage());
            throw new DBException("Error connecting to database: " + e.getMessage());
        }
//        finally {
//            logger.info("Database connection closed successfully (might not have been established).");
//        }
    }
}
