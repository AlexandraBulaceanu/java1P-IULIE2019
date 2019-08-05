import java.util.concurrent.*;
import java.time.*;
public class Exemplu6{
    public static void main(String [] args) throws Exception{
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable r = ()->System.out.println("Hello! It's "+LocalDateTime.now());
        service.schedule(r,5,TimeUnit.SECONDS);
        Thread.sleep(1000);
        service.shutdown();
        //service.scheduleAtFixedRate(r,1,3,TimeUnit);
        //service.scheduleAtFixedDelay(r,1,3,TimeUnit.SECONDS);
        
        
        
        
        
        
        
        
        
    }
}