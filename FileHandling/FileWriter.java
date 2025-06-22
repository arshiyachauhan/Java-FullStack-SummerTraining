import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        //wrapping the filewriter inside buffer enables it to efficiently write the data into the file
        try(BufferedWriter writer= new BufferedWriter(new FileWriter("students.txt"))){
            writer.write("Student 1: John Doe");
            writer.newLine();
            writer.write("Student 2: Jane Smith");
            writer.newLine();
            writer.write("Student 3: Mary Jason");
            System.out.println("Successfully wrote to file");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
