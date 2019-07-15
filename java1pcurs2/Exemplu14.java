import java.io.*;
import java.nio.file.*;
public class Exemplu14{
    public static void main(String [] args){
        Path p = Paths.get("Exemplu14.java");
        try(BufferedReader in = Files.newBufferedReader(p)){
            String line=null;
            while((line=in.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}