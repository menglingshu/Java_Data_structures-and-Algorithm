package jiaoxue;
//演示FileInputStream类的使用

import java.io.*;
public class Demo11_2 {

	public static void main(String[] args)
	{
		//得到一个文件对象
		File f = new File("d:\\text.txt");
		//因为File没有读和写的能力，需要使用InputStream流
		try {
			
			FileInputStream fis = new FileInputStream(f);
			
			//定义一个字节数组，相当于缓存
			byte [] bytes = new byte[1024];
			//循环读取
			int n = 0;//实际读取到的字节数
			while((n=fis.read(bytes)) == -1);
			//把字节转换成String
			String s = new String(bytes,0,n);
			System.out.println(s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
