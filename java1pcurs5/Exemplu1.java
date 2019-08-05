import java.util.concurrent.*;
/*Executor
 * ExecutorService
 * SecheduledExceutorService
 * Executors-clasa utilitara   -> metode statice
 * 
 * 
 * */
public class Exemplu1{
    public static void main(String [] args){
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(()->{for(int i=1;i<20;i+=2)
            System.out.println(i);
        });
        service.shutdown();//opresc firul
        
        
        
        
        
        
        
        
        
    }
}