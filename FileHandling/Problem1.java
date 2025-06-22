//You are given a CSV file named grades.csv with the following format: StudentID, StudentName, Grade, display the contents of file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem {
    public static void main(String[] args) {
        try(BufferedReader reader= new BufferedReader(new FileReader("grades.csv"))){
            String line;
            while((line= reader.readLine()) !=null){
                System.out.println(line);
            }
            
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

