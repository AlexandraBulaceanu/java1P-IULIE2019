import java.util.concurrent.*;

import java.util.*;
public class Exemplu3{
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,5,9,3,6,4);
        
        SumCallable callable = new SumCallable(list);
        ExecutorService service = Executors.newSingleThreadExecutor();
        
        Future<Integer> result = service.submit(callable);
        try{
            Integer suma = result.get();
            System.out.println("suma nr din lista "+suma);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            service.shutdown();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}