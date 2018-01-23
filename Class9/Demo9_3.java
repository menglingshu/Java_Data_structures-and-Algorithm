package Class9;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//事件监听处理机制
public class Demo9_3 extends JFrame implements ActionListener
{
	JPanel mp = null;
	JButton jb1 = null;
	JButton jb2 = null;

	public static void main(String[] args)
	{
		Demo9_3 demo = new Demo9_3();
	}
	public Demo9_3()
	{
		// demo也就是this是监听者，事件源是jb1,jb2
		this.mp = new JPanel();
		this.jb1 = new JButton("黑色");
		this.jb2 = new JButton("红色");
		this.add(jb1, BorderLayout.NORTH);
		this.add(mp);
		this.add(jb2, BorderLayout.SOUTH);
		//注册监听
		jb1.addActionListener(this);
		//指定action命令
		jb1.setActionCommand("black");
		jb2.addActionListener(this);
		jb2.setActionCommand("red");
	
		this.setSize(200,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	//对事件处理的方法(ActionEvent这个是事件处理对象)
	public void actionPerformed(ActionEvent e) {
		//判断是哪个按钮被点击
		if(e.getActionCommand().equals("black"))
		{
			System.out.println("black");
			mp.setBackground(Color.BLACK);
		}else if(e.getActionCommand().equals("red"))
		{
			System.out.println("red");
			mp.setBackground(Color.RED);
		}
		
	}
}

