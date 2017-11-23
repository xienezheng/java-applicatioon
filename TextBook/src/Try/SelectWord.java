package Try;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class SelectWord extends JFrame implements ActionListener  {
	JPanel jp=new JPanel();
	JButton jb1=new JButton("字形修改");
	
	JMenuBar jm=new JMenuBar();
	JMenu file=new JMenu("字型选择");
	
	JMenuItem one=new JMenuItem("宋体");
	JMenuItem two=new JMenuItem("正楷");
	JMenuItem thr=new JMenuItem("微软雅黑");
	JMenuItem four=new JMenuItem("行书");
	JMenuItem five=new JMenuItem("隶书");
	JMenuItem six=new JMenuItem("甲骨文");
	public SelectWord()
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
