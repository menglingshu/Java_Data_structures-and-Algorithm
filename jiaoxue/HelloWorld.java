package jiaoxue;

public class HelloWorld implements Runnable
{
	private int id;
	private String ville;
	private static int cpt = 1;
	
	public HelloWorld(String ville)
	{
		this.ville = ville;
		this.id = cpt++;
	}
	public void run()
	{
		System.out.println("thread " + this.id + " salue " + this.ville);
	}
}
