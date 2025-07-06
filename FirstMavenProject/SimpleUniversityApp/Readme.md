# 🎓 Simple University Student Management System

This is a simple Java-based console application built using **Maven** that demonstrates **CRUD (Create, Read, Update, Delete)** operations for managing student records. It connects to a database using **JDBC**, allowing you to insert, update, delete, and view student details such as their name and date of birth.

## ✨ Features

- Add new student records
- View all students
- View student by ID
- Update existing student
- Delete student from the database
- Simple menu-driven interface
- Uses JDBC for database operations

## 📁 Project Structure

```text
simpleuniversity/
│
├── src/main/java/org/demospring/
│ ├── Main.java # Main application (menu-driven)
│
├── src/main/java/org/demospring/model/
│ └── Student.java # Student entity class
│
├── src/main/java/org/demospring/dao/
│ └── StudentDAO.java # Data Access Object for Student
│
├── src/main/java/org/demospring/util/
│ └── DBConnection.java # Utility class for DB connection
│
├── pom.xml # Maven configuration file
```
## 💡 Technologies Used

- Java 17+  
- JDBC  
- MySQL / PostgreSQL / (any relational DB)  
- Maven (Project build and dependency management)

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/arshiyachauhan/Java-FullStack-SummerTraining/FirstMavenProject/SimpleUniversityApp.git
cd SimpleUniversityApp
```

2. Database Setup
Create a database named university.

Run the following SQL to create the students table:
```bash
CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    date_of_birth DATE
);
```
3. Configure DB Connection
Open DBConnection.java in the util package and update your DB credentials:
```bash
String url = "jdbc:mysql://localhost:3306/simple_university_db";
String user = "yourUsername";
String password = "yourPassword";

````
4. Build and run the application
```bash
mvn compile
mvn exec:java -Dexec.mainClass="org.demospring.Main"
```

## Sample Console Output
```bash
Simple Student Management (CRUD)
1. Add new Student (Create)
2. View all students (Read all)
3. View student by id (Read one)
4. Update Student (Update)
5. Delete student (Delete)
0. Exit
```
📚 Learning Objectives
- This project is ideal for:
- Understanding basic CRUD logic in Java
- Practicing JDBC operations
- Implementing clean architecture using DAO pattern
- Structuring Maven-based Java applications
