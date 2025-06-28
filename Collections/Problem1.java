/*Write a Java program using Map and List collections to store and display the marks of students in 3 subjects. The program should:
Store the student names as keys and a list of marks (for 3 subjects) as values.
Display the student names along with:
Their individual subject marks.
Their average score.
Also, display the name of the student with the highest average.*/


import java.util.*;

public class Collectionsprob {
    public static void main(String[] args) {
        //Create the Map
        Map<String, List<Integer>> studentMarks = new HashMap<>();

        studentMarks.put("Alice", Arrays.asList(85, 90, 88));
        studentMarks.put("Bob", Arrays.asList(78, 82, 80));

        String topStudent = "";
        double highestAverage = 0;

        System.out.println("Student Report:\n");

        //Loop through the map
        for (Map.Entry<String, List<Integer>> entry : studentMarks.entrySet()) {
            String name = entry.getKey();
            List<Integer> marks = entry.getValue();

            int total = 0;
            for (int mark : marks) {
                total += mark;
            }
            double average = total / (double) marks.size();

            // Print student data
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Average: " + average + "\n");

            // top student
            if (average > highestAverage) {
                highestAverage = average;
                topStudent = name;
            }
        }
        System.out.println("Top Performer: " + topStudent + " with an average of " + highestAverage);
    }
}


