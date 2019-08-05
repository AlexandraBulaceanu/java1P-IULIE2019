import java.util.*;
import java.util.stream.*;
public class Exemplu7{
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(10,5,8,4,3,7,2);
        long startTime = System.currentTimeMillis();
        list.parallelStream()
            .filter(elem->test(elem))
            .forEachOrdered(System.out::println);
        System.out.println("parallel stream a durat "+(System.currentTimeMillis()-startTime)+" milisecunde");
        ;
        
        startTime = System.currentTimeMillis();
        list.stream()
            .filter(elem->test(elem))
            .forEach(System.out::println);
        System.out.println("stream a durat "+(System.currentTimeMillis()-startTime)+" milisecunde");
        
        ;
            
            
            
            
            
            
            
            
         
    }
    public static boolean test(Integer i){
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return i%2==0;
    }
}