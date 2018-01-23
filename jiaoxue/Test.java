package jiaoxue;

public class Test {
	public static void main(String []args)
	{
		new Thread(new HelloWorld("Paris")).start();
		new Thread(new HelloWorld("Londres")).start();
		new Thread(new HelloWorld("Tokyo")).start();
	}
	
}
