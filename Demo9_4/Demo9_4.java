package Demo9_4;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo9_4 extends JFrame
{
	MyPanel mp = null;
	public static void main(String[] args)
	{
		Demo9_4 demo = new Demo9_4();
	}
	public Demo9_4()
	{
		mp = new MyPanel();
		this.add(mp);
		this.addKeyListener(mp);
		this.setSize(400, 300);
		this.setVisible(true);
	}
}

class MyPanel extends JPanel implements KeyListener
{
	int x = 10;
	int y = 10;
	public void paint(Graphics g)
	{
		super.paint(g);
		g.fillOval(x, y, 10, 10);
	}

	//一个具体的值被输出
	public void keyTyped(KeyEvent e)
	{
		
	}
	//按下一个键
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			y++;
		}else if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			y--;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			x--;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			x++;
		}
		this.repaint();
	}
	//放开一个键
	public void keyReleased(KeyEvent e) 
	{
		
	}
}
