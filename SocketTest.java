package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest {

	public static void main(String[] args) throws IOException {
		try(Socket s = new Socket("172.25.188.1", 135)) //打开套接字，启动程序内部和外部的通信
		{
			InputStream inStream = s.getInputStream();//获取输入流
			s.setSoTimeout(10000); //超时时间
			Scanner in = new Scanner(inStream);//扫描器对象
			
			while(in.hasNextLine())
			{
				String line = in.nextLine();
				System.out.println(line);
			}
		}catch (InterruptedIOException e) {
			 System.out.println("one!");
		}
	}

}
