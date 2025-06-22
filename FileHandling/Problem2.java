//Adding constraints to the output for grades.csv file and improvising results
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

class StudentRecord {
    int studentId;
    String studentName;
    int grade;

    public StudentRecord(int studentId, String studentName, int grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
}

public class Problem2 {

    public static void main(String[] args) {
        String filePath = "grades.csv";
        List<StudentRecord> validRecords = new ArrayList<>();
        int invalidRecordCount = 0;
        int totalRecords = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine(); 

            while ((line = reader.readLine()) != null) {
                totalRecords++;
                String[] parts = line.split(",");
                try {
                    if (parts.length != 3) {
                        throw new IllegalArgumentException("Incorrect number of fields");
                    }

                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    int grade = Integer.parseInt(parts[2].trim());

                    if (id <= 0) {
                        throw new IllegalArgumentException("Student ID must be positive");
                    }
                    if (grade < 0 || grade > 100) {
                        throw new InvalidGradeException("Grade must be between 0 and 100");
                    }

                    validRecords.add(new StudentRecord(id, name, grade));
                } catch (NumberFormatException e) {
                    System.err.println("Skipping invalid record (Number format error): " + line);
                    invalidRecordCount++;
                } catch (IllegalArgumentException | InvalidGradeException e) {
                    System.err.println("Skipping invalid record: " + e.getMessage() + " - " + line);
                    invalidRecordCount++;
                }
            }

            // Summary report
            double sum = 0;
            for (StudentRecord record : validRecords) {
                sum += record.grade;
            }

            double average = validRecords.isEmpty() ? 0 : sum / validRecords.size();

            System.out.println("\n--- Processing Summary ---");
            System.out.println("Total Records Processed: " + totalRecords);
            System.out.println("Valid Records: " + validRecords.size());
            System.out.println("Invalid Records: " + invalidRecordCount);
            System.out.printf("Average Grade of Valid Records: %.2f\n", average);

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file " + filePath + " was not found.");
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }
}

