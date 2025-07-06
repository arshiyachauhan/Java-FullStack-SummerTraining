package org.demospring;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;
import org.demospring.dao.StudentDAO; 

import org.demospring.model.Student;

public class Main{
	private static final Scanner scanner= new Scanner(System.in);
	private static final StudentDAO studentDAO = new StudentDAO();

//	private static final org.demospring.dao.StudentDAO studentDAO= new StudentDAO();
	public static void main(String[] args) {
		System.out.println("Simp[le Student Management (CRUD) ");
		int choice;

		do {
			displayMenu();
			System.out.print("Enter your choice: ");
			choice= getUserInputInt();
			
			switch(choice) {
			case 1:
				addStudent();
				break;
			case 2:
				viewAllStudents();
				break;
			case 3:
				viewStudentById();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				System.out.println("Exiting application, goodbye");
				break;
			default:
				System.out.println("Invalid choice. Please try again");
				
			}
			System.out.println("\n----------------------------------------\n");
		}while(choice !=0);
		scanner.close();
	}
	
	private static void displayMenu() {
		System.out.println("1. Add new Student (Create)");
		System.out.println("2. View all students (read all)");
		System.out.println("3. View student by id (Read one)");
		System.out.println("4. Update Student (Update)");
		System.out.println("5. Delete student (delete)");
		System.out.println("0. Exit");
	}
	
	//helper for safe integer input
	private static int getUserInputInt() {
		while(!scanner.hasNextInt()) {
			System.out.println("Invalid input, please enter a number");
			scanner.nextInt();
		}
		int input= scanner.nextInt();
		scanner.nextLine();
		return input;
	}
	
	//CRUD operations
	private static void addStudent() {
		System.out.println("\n-- Add new Student---");
		System.out.println("Enter student name");
		String firstName= scanner.nextLine();
		System.out.println("Enter student last name");
		String lastName= scanner.nextLine();
		System.out.println("Enter DOB- (YYYY-MM-DD)");
		String dobString= scanner.nextLine();
		LocalDate dateOfBirth= null;
		try {
			dateOfBirth= LocalDate.parse(dobString);
		}catch(DateTimeParseException e) {
			System.err.println("Invalid date format");
			return;
		}
		Student newStudent= new Student(firstName, lastName, dateOfBirth);
		studentDAO.addStudent(newStudent);
	}
	
	//	Read All
	private static void viewAllStudents() {
		System.out.println("All students");
		List<Student> students= studentDAO.getAllStudents();
		if(students.isEmpty()) {
			System.out.println("No students found");
			return;
		}
		for(Student student: students) {
			System.out.println(student);
		}
	}
	
	//Read one
	private static void viewStudentById() {
		System.out.print("View student by id");
		System.out.print("Enter student ID");
		int studentId= getUserInputInt();
		
		Student student= studentDAO.getStudentById(studentId);
		if(student != null) {
			System.out.println("Student Found" + student);
		}else {
			System.out.print("Student with ID "+ studentId+ " not found.");
		}
	}
	
	//UPDATE
	private static void updateStudent() {
		System.out.print("Udate student");
		System.out.print("Enter student ID to update");
		int studentId= getUserInputInt();
		
		Student existingStudent= studentDAO.getStudentById(studentId);
		if(existingStudent == null) {
			System.out.print("Student with Id  "+ studentId+ "not found");
			return;
		}
		
		System.out.println(" Current student details "+ existingStudent);
		System.out.println("Enter new firstname (or press enter to keep current : "+ existingStudent.getFirstName()+ "): ");
		String firstName= scanner.nextLine();
		if(!firstName.isEmpty()) {
			existingStudent.setFirstName();
		}
		
		System.out.println("Enter new lastname (or press enter to keep current : "+ existingStudent.getLastName()+ "): ");
		String lastName= scanner.nextLine();
		if(!lastName.isEmpty()) {
			existingStudent.setFirstName();
		}
		

		System.out.println("Enter new dob (or press enter to keep current : "+ existingStudent.getDateOfBirth()+ "): ");
		String dobString= scanner.nextLine();
		if(!dobString.isEmpty()) {
			try {
				existingStudent.setDateOfBirth(LocalDate.parse(dobString));
			}catch(DateTimeParseException e) {
				System.err.print("Invalid date format, date not updated");
			}
		}
		studentDAO.updateStudent(existingStudent);
		
	}
	
	//DELETE
	private static void deleteStudent() {
		System.out.println(" Delete student");
		System.out.print("Enter student ID to delete: ");
		int studentId= getUserInputInt();
		studentDAO.deleteStudent(studentId);
	}
}
