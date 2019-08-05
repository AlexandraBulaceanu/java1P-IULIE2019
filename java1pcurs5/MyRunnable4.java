import java.util.concurrent.atomic.*;
public class MyRunnable4 implements Runnable{
    private AtomicInteger x = new AtomicInteger(0);
    @Override
    public void run(){
        for(int i=1;i<=20;i++)
        {
            System.out.println(x.incrementAndGet());
            //rescriu x++; astfel incat operatia sa devina atomica=thread-safe
        }
    }
}