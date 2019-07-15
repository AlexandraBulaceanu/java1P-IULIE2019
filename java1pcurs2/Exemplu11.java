import java.nio.file.*;
import java.io.*;
public class Exemplu11{
    public static void main(String [] args){
        Path p1 = Paths.get("exempluFiles");
        Path p2 = Paths.get("MyFolder");
        try{
            Files.createFile(p1);
            Files.createDirectory(p2);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}