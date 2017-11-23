package Try;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Gui extends JFrame implements ActionListener {
	public static String s,s1;
		
		
	JPanel jp=new JPanel();
	JButton jb1=new JButton("文件");
	JTextPane jtf=new JTextPane();
	JMenuBar jm=new JMenuBar();
	JMenu file=new JMenu("文件");
	JMenu way=new JMenu("格式");
	JMenu help=new JMenu("帮助");
	JMenuItem open=new JMenuItem("打开");
	JMenuItem new1=new JMenuItem("新建");
	JMenuItem save=new JMenuItem("保存");
	JMenuItem color=new JMenuItem("颜色");
	JMenuItem size=new JMenuItem("型号");
	JMenuItem word=new JMenuItem("字形");
	JMenuItem about=new JMenuItem("关于记事本");
	 JScrollPane scrollPane;  
	public Gui()
	{this.setTitle("讷铮记事本");
		this.setBounds(100,100,600,400);
		this.setVisible(true);
		this.add(jp);
		jp.setLayout(null);
		
		jp.add(jtf);
		jtf.setBounds(5,22,575,370);
		
		   
		 jtf.setSelectedTextColor(Color.RED);
		 /*
		         jtf.setLineWrap(true);        //激活自动换行功能 
		          jtf.setWrapStyleWord(true);   
		   */
	jtf.setSelectionColor(Color.red);
	
	
           
   
	
	
		jp.add(jm);
		jm.setBounds(5,0,120,20);
		jm.add(file);
		jm.add(way);
		jm.add(help);
		file.add(open);
		file.add(new1);
		file.add(save);
		way.add(color);
		way.add(size);
		way.add(word);
		help.add(about);
		open.addActionListener(this);
		save.addActionListener(this);
		new1.addActionListener(this);
		color.addActionListener(this);
		size.addActionListener(this);
		word.addActionListener(this);
		about.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		// 判断最初发生Event事件的对象
		if (e.getSource() == save) {
			
		// 获得容器
			JFrame jf=new JFrame();
		int i=0;
		i=JOptionPane.showConfirmDialog(jf, "确定保存？","这是一个确认对话框",JOptionPane.OK_CANCEL_OPTION);
		if(i==0)
		{
			System.out.println("已成功保存");
			JFrame jf1=new JFrame();
			
			s=JOptionPane.showInputDialog(jf1, "重命名","这是一个输入对话框",JOptionPane.INFORMATION_MESSAGE);
			System.out.println(s);
			
			s=s+".java";
			
			s1=jtf.getText();
			Save save1=new Save(s,s1);
			save1.save();
			
			
			JOptionPane.showMessageDialog(jf1,"保存成功","",JOptionPane.INFORMATION_MESSAGE);
			
			
			
		}
		if(i==1)
		{
			System.out.println("用户取消保存");
		}
		} 
		 if(e.getSource()==open) {
			 
			String text="sssssssss";
           JFrame jf1=new JFrame();
			
			s=JOptionPane.showInputDialog(jf1, "文件名","这是一个输入对话框",JOptionPane.INFORMATION_MESSAGE);
			System.out.println(s);
			
			s=s+".java";
			Open open1=new Open(s);
			text=open1.open();
			
			if(text==null)
			{
				JOptionPane.showMessageDialog(jf1,"此文件不存在","",JOptionPane.INFORMATION_MESSAGE);
			}
			else{
jtf.setText(text);	
JOptionPane.showMessageDialog(jf1,"打开成功","",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		 
		 if(e.getSource()==new1)
		 {
			 String text="sssssssss";
	           JFrame jf1=new JFrame();
				
				s=JOptionPane.showInputDialog(jf1, "请输入文件名","这是一个输入对话框",JOptionPane.INFORMATION_MESSAGE);
				System.out.println(s);
				if(text==null)
				{
					JOptionPane.showMessageDialog(jf1,"文件名不能为空","",JOptionPane.INFORMATION_MESSAGE);
				}else
				{
				s=s+".java";
				New1 new1=new New1(s);
				new1.new1();
				jtf.setText(null);
				JOptionPane.showMessageDialog(jf1,"创建成功","",JOptionPane.INFORMATION_MESSAGE);
				}
				
			 
		 }
		 if(e.getSource()==about)
		 {
			 String text="         讷铮记事本以该项目作者谢訥铮的名字命名，功能参照于windows自带记事本，由java实现。2017年11月22日的一个中午，正在的复习"
			 		+ "找工作的中国地质大学计算机学院大三学生谢訥铮正好复习到java 文件和GUI部分，用记事本打开文件时突发奇想产生了模拟实现一个新的记事本的"
			 		+ "想法，经过一个下午努力，完成了此工程的雏形。。。，鉴于作者水平有限，该工程尚有众多不足之处，望海涵！";
	           
				
			jtf.setText(text);
				
			 
		 }
		 
		 if(e.getSource()==color)
		 {
			Select s=new Select();
	           
				
			
				
			 
		 }
		 if(e.getSource()==size)
		 {
			SelectSize s=new SelectSize();
	           
				
			
				
			 
		 }
		 if(e.getSource()==word)
		 {
			SelectWord s=new SelectWord();
	           
				
			
				
			 
		 }

		}
	
	
	
}
