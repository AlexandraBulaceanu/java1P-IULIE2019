import java.util.*;
public class Exemplu16{
    public static void main(String [] args){
        List<String> lista = Arrays.asList("Bucuresti","Sibiu","Cluj","Constanta","Iasi");
        lista.stream()
             .filter(city->city.length()>5)
             .forEach(city->System.out.println(city));
    }
}