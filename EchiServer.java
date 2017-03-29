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
		//���Ƚ���һ�������ض˿�8189�ķ�����
		try(ServerSocket s = new ServerSocket(8189))
		{
			//����accept��������һ����ʾ�Ѿ�������socket����
			try(Socket incoming = s.accept())
			{
				//��������ͷ���֮�䡰����֮���ͨ��
				InputStream inStream = incoming.getInputStream();
				OutputStream outStream = incoming.getOutputStream();
				
				//����ת����ɨ����
				try(Scanner in = new Scanner(inStream))
				{
					//����ת����д����
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
