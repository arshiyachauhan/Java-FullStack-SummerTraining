// SYNTAX- HashMap<KeyDataType, ValueDataType> mapname= new HashMap<>();
import java.util.HashMap;

public class HashMap {
    public static void main(String[] args) {
        // Creating the HashMap
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 95);
        studentScores.put("Alice", 95);

        // Retrieving a value
        Integer aliceScore = studentScores.get("Alice");
        System.out.println("Alice's Score: " + aliceScore);

        // Checking if keys/values exist
        boolean hasBob = studentScores.containsKey("Bob");
        boolean hasScore92 = studentScores.containsValue(92);
        System.out.println(hasBob);
        System.out.println(hasScore92);
        // Iterating over entries
        for (String name : studentScores.keySet()) {
            System.out.println("Student: " + name + ", Score: " + studentScores.get(name));
        }
    }
}
