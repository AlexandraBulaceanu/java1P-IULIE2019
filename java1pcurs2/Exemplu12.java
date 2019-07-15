import java.io.*;
import java.nio.file.*;
public class Exemplu12{
    public static void main(String [] args){
        Path p1 = Paths.get("MyFolder");
        try{
            //if(Files.exists(p1)){Files.delete(p1);}
            Files.deleteIfExists(p1);//elimin posibilitatea de a se arunca NoSuchFileException
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}