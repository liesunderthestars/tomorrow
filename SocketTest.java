package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest {

	public static void main(String[] args) throws IOException {
		try(Socket s = new Socket("172.25.188.1", 135)) //���׽��֣����������ڲ����ⲿ��ͨ��
		{
			InputStream inStream = s.getInputStream();//��ȡ������
			s.setSoTimeout(10000); //��ʱʱ��
			Scanner in = new Scanner(inStream);//ɨ��������
			
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
