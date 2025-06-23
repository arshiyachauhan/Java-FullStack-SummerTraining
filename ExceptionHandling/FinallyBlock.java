import java.io.FileWriter;
import java.io.IOException;

public class FinallyBlock {
    public static void main(String[] args) {
        FileWriter writer= null;
        try{
            writer= new FileWriter("finally_test.txt");
            writer.write("This is a test");
            Integer.parseInt("abc");
        }catch(IOException e){
            System.err.println("An error occurred during writing: "+e.getMessage());
        }finally{
            System.out.println("Finally block is executing");
            if(writer !=null){
                try{
                    writer.close();
                    System.out.println("Writer closed");
                }
                catch(IOException e){
                    System.err.println("Failed to close the writer: "+e.getMessage());
                }
            }
        }
    }
}
