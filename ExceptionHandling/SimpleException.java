import java.io.IOException;

import java.io.FileOutputStream;
public class Exceptions{
    public static void main(String[] args){
        String data= "Hello, students";
        try(FileOutputStream  fos= new FileOutputStream("output.txt")){
            byte[] bytes= data.getBytes();
            fos.write(bytes);
            System.out.println("Data has been written to the file");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
