import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        //wrapping the filereader inside buffer enables it to efficiently read the file line by line instead of character by char
        //it helps to minize i/o operations and give best results through buffered memory
        try(BufferedReader reader= new BufferedReader(new FileReader("students.txt"))){
            String line;
            //end of file represented using null
            while((line= reader.readLine()) !=null){
                System.out.println(line);
            }
            
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

