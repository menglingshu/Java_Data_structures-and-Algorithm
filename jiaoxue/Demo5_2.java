package jiaoxue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo5_2 {

	public static void main(String[] args) throws IOException
	{
		//定义一个可以存放四只狗的对象数组
		Dog dogs[] = new Dog[4];
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		for(int i=0; i<4; i++ )
		{
			dogs[i] = new Dog();
			System.out.println("请输入狗名");
			String name = br.readLine();//从控制台读取狗名
			dogs[i].setName(name);//将名字赋给对象
			System.out.println("请输入体重");
			String weight = br.readLine();
			float s_weight = Float.parseFloat(weight);
			dogs[i].setWeight(s_weight);
		}
		float allWeight = 0;
		for(int i=0; i<4; i++)
		{
			allWeight += dogs[i].getWeight();
		}
		float avgWeight = allWeight/dogs.length;
		System.out.println("总体重 " + allWeight + "平均体重 " + avgWeight);
	}
}

class Dog
{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	private float weight;
	
	
	
}
