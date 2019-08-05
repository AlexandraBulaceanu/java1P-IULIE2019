import java.util.concurrent.*;
public class MyRunnable1 implements Runnable{
    int x=0;
    Semaphore semaphore = new Semaphore(2,true);
    @Override
    public void run(){
    for(int i=0;i<20;i++)
    {
        try{
        semaphore.acquire();
        x++;
        System.out.println(x);
    }catch(Exception e){
        e.printStackTrace();
    }finally{
        semaphore.release();
    }
    }
    }
}