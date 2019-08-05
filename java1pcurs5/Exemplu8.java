import java.util.concurrent.*;
public class Exemplu8{
    /*
     * Semaphore
     * ReentrantReadWriteLock
     * CyclicBarrier
     */
    public static void main(String [] args){
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.execute(new MyRunnable1());
        service.execute(new MyRunnable2());
        service.execute(new MyRunnable3());
    }
}