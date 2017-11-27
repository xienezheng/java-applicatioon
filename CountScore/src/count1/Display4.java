package count1;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Display4 extends JFrame  {
	
	
	
	JPanel jp=new JPanel();
	JLabel jl=new JLabel("最终成绩");
	JTextPane jtf1=new JTextPane();
	JTextPane jtf2=new JTextPane();
	JTextPane jtf3=new JTextPane();
	JTextPane jtf4=new JTextPane();
	JTextPane jtf5=new JTextPane();
	
	
	public Display4(double a,double b,double c,double d)
	{
		this.setTitle("成绩显示器");
		this.setBounds(820,100,100,400);
		this.setVisible(true);
		this.add(jp);
		jp.setLayout(null);
		
		
		jp.add(jtf1);
		jp.add(jl);
		jl.setBounds(20,10,60,30);
		
		jtf1.setBounds(20,50,60,30);
		jp.add(jtf2);
		jtf2.setBounds(20,100,60,30);
		
		jp.add(jtf3);
		jtf3.setBounds(20,150,60,40);
	
	
		jp.add(jtf4);
		jtf4.setBounds(20,200,60,30);
		jp.add(jtf5);
		jtf5.setBounds(20,250,60,30);
		String s1=String.valueOf(a);
		jtf1.setText(s1);
		String s2=String.valueOf(b);
		jtf2.setText(s2);
		String s3=String.valueOf(c);
		jtf3.setText(s3);
		String s4=String.valueOf(d);
		jtf4.setText(s4);
		
	}
	

	
	
}