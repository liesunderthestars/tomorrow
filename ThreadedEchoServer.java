package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ThreadedEchoServer {

	public static void main(String[] args) {
		try{
			int i = 1;
			ServerSocket s = new ServerSocket(8199);
			while(true)
			{
				Socket incoming = s.accept();
				System.out.println("Spawning" + i);
				//使用线程进行与多个客户端进行通信
				Runnable r = new ThreadedEchoHandler(incoming);
				Thread t = new Thread();
				t.start();
				i++;
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
class ThreadedEchoHandler implements Runnable{
	private Socket incoming;
	public ThreadedEchoHandler(Socket i)
	{
		incoming = i;
	}
	public void run()
	{
		try{
			try{
				InputStream inStream = incoming.getInputStream();
				OutputStream outStream = incoming.getOutputStream();
				
				Scanner in = new Scanner(inStream);
				PrintWriter out = new PrintWriter(outStream,true);
				
				out.println("Hello!Enter BYE to exit.");
				
				boolean done = false;
				while(!done && in.hasNextLine())
				{
					String s = in.nextLine();
					out.println("Echo:"+ s);
					if(s.trim().equals("BYE"))
						done = true;
				}
			}
			finally{
				incoming.close();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
