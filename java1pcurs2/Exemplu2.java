import java.io.*;
public class Exemplu2{
    public static void main(String [] args){
        File file = new File("A/x.txt");//cale catre fisierul ce va fi pus in folderul A
        try{
            file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}