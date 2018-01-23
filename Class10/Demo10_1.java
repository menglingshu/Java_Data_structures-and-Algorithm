package Class10;

public class Demo10_1 implements Runnable{
	
	public void run()
	{
		int times = 0;
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello world" + times);
			times++;
			if(times==10)
			{
				break;
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		Demo10_1 demo = new Demo10_1();
		Thread t = new Thread(demo);
		t.start();
	}
	
}
