package Class9;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

//java绘图原理
public class Demo9_1 extends JFrame
{

	MyPanel mp = null;
	public static void main(String[] args)
	{
		Demo9_1 d= new Demo9_1();
	}
	public Demo9_1()
	{
		mp = new MyPanel();
		this.add(mp);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
// 定义一个我自己的面板
class MyPanel extends JPanel
{
	//覆盖JPanel的paint方法
	//Graphics是绘图的重要类，可以理解为画笔
	public void paint(Graphics g)
	{
		//调用父类函数完成初始化
		super.paint(g);
		g.drawOval(10, 10, 30, 30);
		g.drawLine(10, 10, 40, 40);
		g.drawRect(50, 50, 30, 20);
		//填充颜色
		g.setColor(Color.BLUE);
		//填充矩形
		g.fillRect(70, 70, 40, 30);
		
		//画图片
		Image im = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/0.gif"));
		g.drawImage(im, 90, 90, 200, 150, this);
		//画出字
		g.setColor(Color.GRAY);
		g.setFont(new Font("Georgia",Font.BOLD, 50));
		g.drawString("Hello World", 100, 100);
	}
	
}