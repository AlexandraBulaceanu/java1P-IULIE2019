import java.io.*;
public class Exemplu6{
    public static void main(String [] args){
        try(FileOutputStream fos = new FileOutputStream("produs.dat");
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ){
            Produs p = new Produs("pix",1.5,"birotica");
            out.writeObject(p);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}