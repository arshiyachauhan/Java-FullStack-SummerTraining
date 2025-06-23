import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionReading {
    public static void main(String[] args) {
        try{
            readFile("students.txt");
        }catch(IOException e){
            System.err.println("An error occurred during main method: "+ e.getMessage());
        }
    }
        public static void readFile(String FileName) throws IOException{
             BufferedReader reader= new BufferedReader(new FileReader(FileName));
            String line;
            while((line= reader.readLine()) !=null){
                System.out.println(line);
            }
            reader.close();
        }
    }





