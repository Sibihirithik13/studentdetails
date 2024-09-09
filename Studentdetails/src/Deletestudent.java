import java.sql.*;

public class Deletestudent {
    public void studentDelete(int carId) throws Exception {
        // Database connection details
        String url = "jdbc:mysql://127.0.0.1:3306/std";
        String username = "root";
        String password = "5522";
        
        // SQL query to delete a record from the car table
        String query = "DELETE FROM car WHERE id = ?";
        
        // Establish connection to the database
        Connection con = DriverManager.getConnection(url, username, password);
        
        // Prepare the statement for the deletion
        PreparedStatement pst = con.prepareStatement(query);
        
        // Set the car ID parameter in the query
        pst.setInt(1, carId);
        
        // Execute the deletion
        int rowsAffected = pst.executeUpdate();
        
        if (rowsAffected > 0) {
            System.out.println("Car with ID " + carId + " deleted successfully.");
        } else {
            System.out.println("No car found with ID " + carId + ".");
        }
        
        // Close the connection
        con.close();
    }

    public static void main(String[] args) throws Exception {
        // Example car ID to delete
        int carId = 102;  // Change this ID to the car record you want to delete
        
        // Create an instance of Deletestudent and call the deletion method
        Deletestudent deleteObj = new Deletestudent();
        deleteObj.studentDelete(carId);
    }
}
