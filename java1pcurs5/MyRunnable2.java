import java.util.concurrent.locks.*;
import java.util.*;
public class MyRunnable2 implements Runnable{
    int x;
    int sum=0;
    Random r = new Random();
    ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    @Override
    public void run(){
        changeX();
        readX();
    }
    public void readX(){
        rwl.readLock().lock();
        sum+=x;
        rwl.readLock().unlock();
    }
    public void changeX(){
        rwl.writeLock().lock();
        x = r.nextInt();
        rwl.writeLock().unlock();
    }
}