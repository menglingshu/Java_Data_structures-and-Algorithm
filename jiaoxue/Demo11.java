package jiaoxue;
//文件IO流的创建和函数调用
import java.io.*;

public class Demo11 {
	
	public static void main(String[] args)
	{
		//创建一个文件对象
		//File f = new File("d:\\aaa.txt");
		//得到文件的路径
		//System.out.println("文件路径" + f.getAbsolutePath());
		//得到文件的大小 字节数
		//System.out.println("文件字节大小" + f.length());
		//System.out.println("可读" + f.canRead());
		//创建文件 创建文件夹
		File f = new File("d:\\mls.txt");
		if(!f.exists())
		{
			//可以创建
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
		{
			System.out.println("文件已存在不能创建");
		}
		File ff = new File("d:\\ff");
		if(ff.isDirectory())
		{
			System.out.println("文件夹已存在");
		}else{
			ff.mkdir();
		}
		//列出一个文件夹下面的所有文件
		File f2 = new File("d:\\ff");
		if(f2.isDirectory())
		{
			File listes[] = f.listFiles();
			for(int i=0; i<listes.length; i++)
			{
				System.out.println("文件名" + listes[i].getName());
			}
		}
	}

}
