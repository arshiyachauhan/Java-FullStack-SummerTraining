import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFound {
    public static void main(String[] args) {
        try{
            BufferedReader reader= new BufferedReader(new FileReader("non_existing_file.txt"));
            String line;
            while((line= reader.readLine()) !=null){
                System.out.println(line);
            }
            reader.close();
            
        }catch(FileNotFoundException e){
            System.err.println("Error: File was not found");
            e.printStackTrace();
        }
        //handling general exception
        catch(IOException e){
            System.err.println("An I/O error occurred "+ e.getMessage());
        }
    }
}


