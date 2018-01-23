package Class11;

public class Demo11_1
{
	//定义三个售票窗口
	public static void main(String[] args)
	{
		TicketWindow tw = new TicketWindow();
		Thread th1 = new Thread(tw);
		Thread th2 = new Thread(tw);
		Thread th3 = new Thread(tw);
		th1.start();
		th2.start();
		th3.start();
		
	}
	
}

//售票窗口类
class TicketWindow implements Runnable
{
	//一共两千张票
	private int numTotal = 2000;
	@Override
	public void run() {
		while(true)
		{
			//一秒出一张票
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//这段代码需要保证原子性【同步代码块】
			synchronized(this)
			{	if(numTotal>0)
				{
					//Thread.currentThread().getName()
					System.out.println(Thread.currentThread().getName() + "还有" + numTotal + "张票");
					numTotal--;
				}else{
					//售票结束
					break;
				}
			}
		}
		
	}
	
}