package thread;

import java.util.concurrent.*;
import net.mmview.util.*;

public  class DaemonFromfactory implements Runnable{
public void run() {
	try{
		while (true) {
			TimeUnit.MILLISECONDS.sleep(100);
			System.out.println(Thread.currentThread()+" "+this);
		}
	}catch(InterruptedException e){
		System.out.println("Interrupted");
	}
		
	}

	public static void main(String[] args) throws Exception
	{
		ExecutorService exec=Executors.newCachedThreadPool(new DaemonThreadFactory());
		for(int i=0;i<10;i++)
			exec.execute(new DaemonFromfactory());
		System.out.println("All daemons started");
		TimeUnit.MILLISECONDS.sleep(500);
	}

}
