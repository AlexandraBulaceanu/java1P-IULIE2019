import java.util.concurrent.*;
public class Exemplu2{
    /*
     * Callable
     * 
     * public T call() throws Exception
     * 
     */
    
    public static void main(String [] args){
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> result = service.submit(()->{return "buna";});
        try{
            //procesari...
            String message = result.get();
            System.out.println("mesaj: "+message);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            service.shutdown();
        }
        
        
        
        
        
        
        
        
        
    }
}