package Try;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Select extends JFrame implements ActionListener  {
	JPanel jp=new JPanel();
	JButton jb1=new JButton("确认修改");
	
	JMenuBar jm=new JMenuBar();
	JMenu file=new JMenu("颜色选择");
	
	JMenuItem red=new JMenuItem("红色");
	JMenuItem org=new JMenuItem("橙色");
	JMenuItem yel=new JMenuItem("黄色");
	JMenuItem gre=new JMenuItem("绿色");
	JMenuItem blue=new JMenuItem("蓝色");
	JMenuItem bla=new JMenuItem("黑色");
	public Select()
	{
		this.setTitle("颜色选择");
		this.setBounds(300,300,200,100);
		this.setVisible(true);
		this.add(jp);
		jp.setLayout(null);
		
		jp.add(jb1);
		jb1.setBounds(80,20,100,50);
		
		   
	
		jp.add(jm);
		jm.setBounds(5,0,120,20);
		jm.add(file);
		jm.add(red);
		jm.add(org);
		file.add(yel);
		file.add(gre);
		file.add(blue);
		file.add(bla);
		file.add(red);
		file.add(org);
		
		red.addActionListener(this);
		org.addActionListener(this);
		yel.addActionListener(this);
		gre.addActionListener(this);
		blue.addActionListener(this);
		bla.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}

}
