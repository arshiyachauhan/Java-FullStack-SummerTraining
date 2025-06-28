/*Collections in java can be referred to as an object that stores a group of elements (objects).
 * provides a unified architecture for storing, retrieving, and manipulating data.
 * It includes interfaces and classes like List, Set, Queue, and Map.
*/

import java.util.*;
public class Collections {
    public static void main(String[] args) {
        
        //Implementing a list
        List<String> names= Arrays.asList("John","Jane","Joe","Adam");

        for (String name : names) {
            System.out.println(name);
        }

        //Implementing a Set
        Set<String> cities = new HashSet<>(Arrays.asList("Delhi", "Mumbai", "Chennai", "Delhi"));

        for (String city : cities) {
            System.out.println(city);
        }


        //Implementing a Map
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }


        //Implementing a Queue
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");

        while (!tasks.isEmpty()) {
            System.out.println("Processing: " + tasks.poll());
        }
    
    }
}

