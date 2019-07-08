import java.io.*;
public class Exemplu7{
    public static void main(String [] args){
        try(FileInputStream file = new FileInputStream("produs.dat");
            ObjectInputStream in = new ObjectInputStream(file);
        ){
            Produs p = (Produs)in.readObject();
            System.out.println(p.nume+" "+p.pret+" "+p.categorie);
        }catch(IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}