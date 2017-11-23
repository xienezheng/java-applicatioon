package Try;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class SelectSize extends JFrame implements ActionListener  {
	JPanel jp=new JPanel();
	JButton jb1=new JButton("确认修改");
	
	JMenuBar jm=new JMenuBar();
	JMenu file=new JMenu("字号选择");
	
	JMenuItem one=new JMenuItem("1");
	JMenuItem two=new JMenuItem("2");
	JMenuItem thr=new JMenuItem("3");
	JMenuItem four=new JMenuItem("4");
	JMenuItem five=new JMenuItem("5");
	JMenuItem six=new JMenuItem("6");
	public SelectSize()
	{
		this.setTitle("字号选择");
		this.setBounds(300,300,200,100);
		this.setVisible(true);
		this.add(jp);
		jp.setLayout(null);
		
		jp.add(jb1);
		jb1.setBounds(80,20,100,50);
		
		   
	
		jp.add(jm);
		jm.setBounds(5,0,120,20);
		jm.add(file);
		
		file.add(one);
		file.add(two);
		file.add(thr);
		file.add(four);
		file.add(five);
		file.add(six);
		
		one.addActionListener(this);
		two.addActionListener(this);
		thr.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}

}
