import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SubmitFormServlet")
public class SubmitFormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullName = request.getParameter("full_name");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String regNumber = request.getParameter("reg_number");
        String campus = request.getParameter("campus");
        String phone = request.getParameter("phone");
        String clubName = request.getParameter("club_name");
        String role = request.getParameter("role");
        String gender = request.getParameter("gender");

        // Database connection parameters
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database_name";
        String dbUser = "your_database_user";
        String dbPassword = "your_database_password";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Prepare an SQL statement
            String sql = "INSERT INTO club_registrations (full_name, email, username, reg_number, campus, phone, club_name, role, gender) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, fullName);
            statement.setString(2, email);
            statement.setString(3, username);
            statement.setString(4, regNumber);
            statement.setString(5, campus);
            statement.setString(6, phone);
            statement.setString(7, clubName);
            statement.setString(8, role);
            statement.setString(9, gender);

            // Execute the SQL statement
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response.getWriter().println("New record created successfully");
            }

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
