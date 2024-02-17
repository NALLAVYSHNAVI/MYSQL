import java.sql.*;
class Main {
    public static void main(String[] args) {
        // Database connection details
        String dbUrl = "jdbc:mysql://localhost/w3schools";
        String dbUser = "root";
        String dbPassword = "Vyshu@123";

        // JDBC variables
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Establishing the connection
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            // Creating the 'employee' table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employ("
                    + "empcode INT PRIMARY KEY, "
                    + "empname VARCHAR(255), "
                    + "empage INT, "
                    + "empsalary DOUBLE)";
            preparedStatement = connection.prepareStatement(createTableSQL);
            preparedStatement.execute();

            // Inserting data into the 'employee' table
            String insertDataSQL = "INSERT INTO employ (empcode, empname, empage, empsalary) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertDataSQL);

            int[] empCodes = {101, 102, 103, 104, 105};
            String[] empNames = {"Jenny", "Jacky", "Joe", "John", "Shameer"};
            int[] empAges = {25, 30, 20, 40, 25};
            double[] empSalaries = {10000, 20000, 40000, 80000, 90000};

            for (int i = 0; i < empCodes.length; i++) {
                preparedStatement.setInt(1, empCodes[i]);
                preparedStatement.setString(2, empNames[i]);
                preparedStatement.setInt(3, empAges[i]);
                preparedStatement.setDouble(4, empSalaries[i]);

                // Execute the update
                preparedStatement.executeUpdate();
            }

            System.out.println("Table created and data inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Closing resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}