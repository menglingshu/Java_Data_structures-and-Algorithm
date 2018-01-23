package jiaoxue;

public class Demo5 {
	
	public static void main(String[] args)
	{
		float arr[] = new float[6];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3.5f;
		arr[3] = 5;
		arr[4] = 8;
		arr[5] = 9;
		
		float all = 0;
		for(int i=0; i<6; i++)
		{
			all = arr[i] + all;
		}
		System.out.println("Sum is " + all);
	}
}
