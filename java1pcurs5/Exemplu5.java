import java.util.*;
import java.util.concurrent.*;
public class Exemplu5{
    public static void main(String [] args){
        ExecutorService service = Executors.newCachedThreadPool();
        List<Integer> list1 = Arrays.asList(23,85,96,41);
        List<Integer> list2 = Arrays.asList(56,78,2,4);
        List<Integer> list3 = Arrays.asList(3,8,9,1);
        Future<Integer> res1 = service.submit(new SumCallable(list1));
        Future<Integer> res2 = service.submit(new SumCallable(list2));
        Future<Integer> res3 = service.submit(new SumCallable(list3));
        
        try{
            System.out.println("sum1 "+res1.get());
            System.out.println("sum1 "+res2.get());
            System.out.println("sum1 "+res3.get());
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            service.shutdown();
        }
        
        
        
        
        
        
        
        
        
    }
}