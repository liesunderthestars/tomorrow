package javaio;

import java.io.*;

public class read {
	//声明一下可能出现的异常
	public static void main(String[] args) throws IOException {
		//System.in是个没包装的类，so，用用BufferedReader进行包装，需用InputStreamReader转换Reader
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=stdin.readLine())!=null&&s.length()!=0)
		{
			System.out.println(s);
		}
	}

}
