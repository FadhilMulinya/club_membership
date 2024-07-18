
# Zetech University Clubs Registration Form

![alt text](/FRONTEND/image.png)

![alt text](/FRONTEND/image-1.png)

![alt text](/FRONTEND/image3.png)

## Project Overview

This project is a web-based registration form for Zetech University clubs. It allows users to enter their details and register for various university clubs. The form captures essential information such as full name, email, username, registration number, campus, phone number, club name, role, and gender. The submitted data is stored in a MySQL database for further processing.

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Database Structure](#database-structure)
- [Contributing](#contributing)
- [License](#license)

## Features

- User-friendly registration form
- Responsive design
- Form validation
- Stores registration data in a MySQL database

## Technologies Used

- HTML
- CSS
- JavaScript
- Java (JSP and Servlets)
- MySQL

## Setup and Installation

### Prerequisites

- Java Development Kit (JDK)
- Apache Tomcat Server
- MySQL Server
- A text editor or IDE (e.g., VSCode, IntelliJ IDEA)

### Installation Steps

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/zetech-university-clubs-registration.git
   cd zetech-university-clubs-registration
   ```

2. **Set Up the MySQL Database**
   - Log in to your MySQL server and create a new database:
     ```sql
     CREATE DATABASE club_registrations;
     ```
   - Create the `registrations` table:
     ```sql
     USE club_registrations;

     CREATE TABLE registrations (
         id INT AUTO_INCREMENT PRIMARY KEY,
         full_name VARCHAR(100) NOT NULL,
         email VARCHAR(100) NOT NULL,
         username VARCHAR(50) NOT NULL,
         reg_number VARCHAR(50) NOT NULL,
         campus VARCHAR(50) NOT NULL,
         phone VARCHAR(15) NOT NULL,
         club_name VARCHAR(50) NOT NULL,
         role VARCHAR(50) NOT NULL,
         gender ENUM('Male', 'Female', 'Prefer not to say') NOT NULL
     );
     ```

3. **Configure the Project**
   - Open the project in your preferred text editor or IDE.
   - Update the database connection details in `submit_form.jsp`:
     ```java
     String dbURL = "jdbc:mysql://localhost:3306/club_registrations";
     String dbUser = "your_username";
     String dbPassword = "your_password";
     ```

4. **Deploy the Project**
   - Copy the project folder to your Tomcat `webapps` directory.
   - Start the Tomcat server.

## Usage

1. Open a web browser and navigate to `http://localhost:8080/zetech-university-clubs-registration`.
2. Fill in the registration form with the required details.
3. Click the "Register" button to submit the form.
4. The data will be stored in the MySQL database.

## Database Structure

The `registrations` table structure is as follows:

| Column Name    | Data Type | Constraints                      |
|----------------|-----------|----------------------------------|
| id             | INT       | PRIMARY KEY, AUTO_INCREMENT      |
| full_name      | VARCHAR   | NOT NULL                         |
| email          | VARCHAR   | NOT NULL                         |
| username       | VARCHAR   | NOT NULL                         |
| reg_number     | VARCHAR   | NOT NULL                         |
| campus         | VARCHAR   | NOT NULL                         |
| phone          | VARCHAR   | NOT NULL                         |
| club_name      | VARCHAR   | NOT NULL                         |
| role           | VARCHAR   | NOT NULL                         |
| gender         | ENUM      | ('Male', 'Female', 'Prefer not to say'), NOT NULL |

## Contributing

Contributions are welcome! Please follow these steps to contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

