package javaio;

import java.io.*;

public class read {
	//����һ�¿��ܳ��ֵ��쳣
	public static void main(String[] args) throws IOException {
		//System.in�Ǹ�û��װ���࣬so������BufferedReader���а�װ������InputStreamReaderת��Reader
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=stdin.readLine())!=null&&s.length()!=0)
		{
			System.out.println(s);
		}
	}

}
