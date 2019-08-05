import java.util.concurrent.*;
public class MyRunnable3 implements Runnable{
    private CyclicBarrier barrier = new CyclicBarrier(4);
    @Override
    public void run(){
        System.out.println("start");
        try{
            barrier.await();
            System.out.println("end");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}