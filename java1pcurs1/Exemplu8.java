import java.io.*;
//scriem o instanta de C in fisier
public class Exemplu8{
    public static void main(String [] args){
        try(FileOutputStream fos = new FileOutputStream("c");
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ){
            C c = new C();
            out.writeObject(c);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}