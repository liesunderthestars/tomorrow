package thread;

import java.util.concurrent.*;

public class SimpleDaemons implements Runnable{
	public void run() {
		try{
			while(true){
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread()+" "+this);
			}
		}catch(InterruptedException e){
			System.out.println("sleep() interrupted");
		}
	}
	public static void main(String[] args) throws Exception {
		for(int i=0;i<10;i++)
		{
			Thread deamon = new Thread(new SimpleDaemons());
			deamon.setDaemon(true);
			deamon.start();
		}
		System.out.println("All deamons start");
		TimeUnit.MILLISECONDS.sleep(100);
	}

}
