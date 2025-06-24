/*Create a java program that uses a HashMap to manage a student gradebook. The program should store student names(String) as keys and their corresponding grades(Integer) as values.
Implement the following functionalities-
1. Add a new Student and their grade
2. Update a student's grade
3. Display the grade of a specific student.
4. Remove a student from the gradebook.
5. Display all students and their grades
6. Calculate and display the average grade of all students.*/

import java.util.HashMap;

public class HashMapProb {
    public static void main(String[] args) {
        HashMap<String, Integer> studentGrades = new HashMap<>();
        
        studentGrades.put("Ram", 80);
        studentGrades.put("Riya", 92);
        studentGrades.put("Rohan", 85);
        
        //.replace method can also be used to update the existing info
        studentGrades.put("Ram", 88);
        
        Integer riyaScore = studentGrades.get("Riya");
        System.out.println("Riya's score: " + riyaScore);
        
        studentGrades.remove("Rohan");
        
        for (String name : studentGrades.keySet()) {
            System.out.println("Student: " + name + ", Score: " + studentGrades.get(name));
        }
    
        int total = 0;
        for (int score : studentGrades.values()) {
            total += score;
        }
        double average = studentGrades.isEmpty() ? 0 : (double) total / studentGrades.size();
        System.out.printf("\nAverage Grade: %.2f\n", average);
    }
}

   

