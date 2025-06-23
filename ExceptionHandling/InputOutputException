//Exception- case that will disrupt the flow of ur program, thus exception Handling is necessary, we try to catch in catch block it and correct it
//Types of Exception: Unchecked(compile time) and Checked(runtime)
//error- are dealt with 
import java.io.IOException;//checked exception
import java.io.FileInputStream;
public class FileException{
    public static void main(String[] args){
        try(FileInputStream  fis= new FileInputStream("output.txt")){
           int content;
           while((content= fis.read()) != -1){
            System.out.print((char) content);
           }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
