package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchiServer {

	public static void main(String[] args) throws IOException {
		//首先建立一个负责监控端口8189的服务器
		try(ServerSocket s = new ServerSocket(8189))
		{
			//调用accept方法返回一个表示已经建立的socket对象
			try(Socket incoming = s.accept())
			{
				//服务器与客服端之间“流”之间的通信
				InputStream inStream = incoming.getInputStream();
				OutputStream outStream = incoming.getOutputStream();
				
				//将流转换成扫描器
				try(Scanner in = new Scanner(inStream))
				{
					//将流转换成写入器
					PrintWriter out = new PrintWriter(outStream,true);
					out.println("Hello!Enter BYE to exit.");
					
					boolean dome = false;
					while(!dome && in.hasNextLine())
					{
						String line = in.nextLine();
						out.println("Echo:"+line);
						if(line.trim().equals("BYE"))
							dome = true;
					}
				}
			}
		}
	}

}
