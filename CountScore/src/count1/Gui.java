package count1;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Gui extends JFrame implements ActionListener {
	public static String num;
		int num1;
	JLabel jl1=new JLabel("科目");
	JLabel jl2=new JLabel("学分");
	JLabel jl3=new JLabel("平时成绩");
	JLabel jl5=new JLabel("平时成绩占比");
	JLabel jl4=new JLabel("期末成绩");
	JButton jb3=new JButton("计算各科成绩及平均绩点");
	
	
	JPanel jp=new JPanel();
	
	JTextPane jtf1=new JTextPane();
	JTextPane jtf2=new JTextPane();
	JTextPane jtf3=new JTextPane();
	JTextPane jtf4=new JTextPane();
	JTextPane jtf5=new JTextPane();
	JTextPane jtf6=new JTextPane();
	JTextPane jtf7=new JTextPane();
	JTextPane jtf8=new JTextPane();
	JTextPane jtf9=new JTextPane();
	JTextPane jtf10=new JTextPane();
	JTextPane jtf11=new JTextPane();
	JTextPane jtf12=new JTextPane();
	
	JTextPane jtf13=new JTextPane();
	JTextPane jtf14=new JTextPane();
	JTextPane jtf15=new JTextPane();
	JTextPane jtf16=new JTextPane();
	JTextPane jtf17=new JTextPane();
	JTextPane jtf18=new JTextPane();
	JTextPane jtf19=new JTextPane();
	JTextPane jtf20=new JTextPane();
	JTextPane jtf21=new JTextPane();
	
	JTextPane jtfa=new JTextPane();
	JTextPane jtfb=new JTextPane();
	JTextPane jtfc=new JTextPane();
	JTextPane jtfd=new JTextPane();
	JTextPane jtfe=new JTextPane();
	
	
	public Gui(String s)
	{num=s;
	num1=Integer.parseInt(num);
		this.setTitle("成绩计算器");
		this.setBounds(100,100,700,400);
		this.setVisible(true);
		this.add(jp);
		jp.setLayout(null);
		
		
		jp.add(jl1);
		
		jp.add(jtf1);
		jtf1.setBounds(20,50,60,30);
		jp.add(jtfa);
		jtfa.setBounds(610,50,60,30);
		jp.add(jl2);
		
		jp.add(jtf2);
		jtf2.setBounds(170,50,60,30);
		jp.add(jl3);
		
		jp.add(jtf3);
		jtf3.setBounds(310,50,60,30);
		jp.add(jl4);
	
		jp.add(jtf4);
		jtf4.setBounds(460,50,60,30);
		jp.add(jl5);
		jl1.setBounds(30,10,50,40);
		jl2.setBounds(180,10,50,40);
		jl3.setBounds(320,10,60,40);
		jl4.setBounds(470,10,60,40);
		jl5.setBounds(600,10,100,40);
		
		jp.add(jtf5);
		jtf5.setBounds(20,100,60,30);
		jp.add(jtf6);
		jtf6.setBounds(170,100,60,30);
		jp.add(jtf7);
		jtf7.setBounds(310,100,60,30);
		jp.add(jtf8);
		jtf8.setBounds(460,100,60,30);
		
		jp.add(jtfb);
		jtfb.setBounds(610,100,60,30);
		
		jp.add(jtf9);
		jtf9.setBounds(20,150,60,30);
		jp.add(jtf10);
		jtf10.setBounds(170,150,60,30);
		jp.add(jtf11);
		jtf11.setBounds(310,150,60,30);
		jp.add(jtf12);
		jtf12.setBounds(460,150,60,30);
		jp.add(jtfc);
		jtfc.setBounds(610,150,60,30);
		
		jp.add(jtf13);
		jtf13.setBounds(20,200,60,30);
		jp.add(jtf14);
		jtf14.setBounds(170,200,60,30);
		jp.add(jtf15);
		jtf15.setBounds(310,200,60,30);
		jp.add(jtf16);
		jtf16.setBounds(460,200,60,30);
		jp.add(jtfd);
		jtfd.setBounds(610,200,60,30);
		

		jp.add(jtf17);
		jtf17.setBounds(20,250,60,30);
		jp.add(jtf18);
		jtf18.setBounds(170,250,60,30);
		jp.add(jtf19);
		jtf19.setBounds(310,250,60,30);
		jp.add(jtf20);
		jtf20.setBounds(460,250,60,30);
		jp.add(jtfe);
		jtfe.setBounds(610,250,60,30);
		
		   
	
	
		jp.add(jb3); 
		jb3.setBounds(490,310,200, 50);
   
	jb3.addActionListener(this);
	
	
	}
	
	public void actionPerformed(ActionEvent e) {
		
		// 判断最初发生Event事件的对象
		if (e.getSource() == jb3) {
			
		// 获得容器
			
			if(num1==1)
			{
		
			String name1=jtf1.getText();
			String credit1=jtf2.getText();
			String num1=jtf3.getText();
			String num2=jtf4.getText();
			String rate=jtfa.getText();
			int num11=Integer.parseInt(num1);
			int num22=Integer.parseInt(num2);
			double rate1=Double.parseDouble(rate);
			
			double finalCre=num11*rate1+(1-rate1)*num22;
			double finaldit=finalCre;
			Display1 d=new Display1(finalCre);
			Count c=new Count(1,finaldit);
			
			}
			if(num1==2)
			{
			
				String name1=jtf1.getText();
				String credit1=jtf2.getText();
				String num1=jtf3.getText();
				String num2=jtf4.getText();
				String rate=jtfa.getText();
				int num11=Integer.parseInt(num1);
				int num22=Integer.parseInt(num2);
				double rate1=Double.parseDouble(rate);
				
				double finalCre=num11*rate1+(1-rate1)*num22;
				
				
				
				
				

			String name2=jtf5.getText();
			
			String credit2=jtf6.getText();
			String num3=jtf7.getText();
			String num4=jtf8.getText();
			String rate2=jtfb.getText();
			int num33=Integer.parseInt(num3);
			int num44=Integer.parseInt(num4);
			double rate3=Double.parseDouble(rate);
			
			double finalCre2=num33*rate3+(1-rate3)*num44;
			double Finaldit2=finalCre;
			double one=Double.parseDouble(credit1);
			double two=Double.parseDouble(credit2);
			
			double finaldit=(finalCre*one+finalCre2*two)/(one+two);
			
			Diaplay d=new Diaplay(finalCre,finalCre2);
			Count c=new Count(2,finaldit);
			}
			if(num1==3)
			{
			
				String name1=jtf1.getText();
				String credit1=jtf2.getText();
				String num1=jtf3.getText();
				String num2=jtf4.getText();
				String rate=jtfa.getText();
				int num11=Integer.parseInt(num1);
				int num22=Integer.parseInt(num2);
				double rate1=Double.parseDouble(rate);
				
				double finalCre=num11*rate1+(1-rate1)*num22;
				double Finaldit=finalCre;
				
				
				
				

			String name2=jtf5.getText();
			
			String credit2=jtf6.getText();
			String num3=jtf7.getText();
			String num4=jtf8.getText();
			String rate2=jtfb.getText();
			int num33=Integer.parseInt(num3);
			int num44=Integer.parseInt(num4);
			double rate3=Double.parseDouble(rate);
			
			double finalCre2=num33*rate3+(1-rate3)*num44;
			double Finaldit2=finalCre;
		
			
			
String name3=jtf9.getText();
			
			String credit3=jtf10.getText();
			String num6=jtf11.getText();
			String num7=jtf12.getText();
			String rate4=jtfc.getText();
			int num55=Integer.parseInt(num6);
			int num66=Integer.parseInt(num7);
			double rate5=Double.parseDouble(rate4);
			
			double finalCre3=num55*rate5+(1-rate5)*num66;
			double Finaldit3=finalCre3;
		
			Display3 d=new Display3(finalCre,finalCre2,finalCre3);
			
			double one=Double.parseDouble(credit1);
			double two=Double.parseDouble(credit2);
			double thr=Double.parseDouble(credit3);
			
			double finaldit=(finalCre*one+finalCre2*two+finalCre3*thr)/(one+two+thr);
			
			
			Count c=new Count(3,finaldit);
			}
			if(num1==4)
			{
			
				String name1=jtf1.getText();
				String credit1=jtf2.getText();
				String num1=jtf3.getText();
				String num2=jtf4.getText();
				String rate=jtfa.getText();
				int num11=Integer.parseInt(num1);
				int num22=Integer.parseInt(num2);
				double rate1=Double.parseDouble(rate);
				
				double finalCre=num11*rate1+(1-rate1)*num22;
				double Finaldit=finalCre;
				
				
				
				

			String name2=jtf5.getText();
			
			String credit2=jtf6.getText();
			String num3=jtf7.getText();
			String num4=jtf8.getText();
			String rate2=jtfb.getText();
			int num33=Integer.parseInt(num3);
			int num44=Integer.parseInt(num4);
			double rate3=Double.parseDouble(rate);
			
			double finalCre2=num33*rate3+(1-rate3)*num44;
			double Finaldit2=finalCre;
		
			
			
String name3=jtf9.getText();
			
			String credit3=jtf10.getText();
			String num6=jtf11.getText();
			String num7=jtf12.getText();
			String rate4=jtfc.getText();
			int num55=Integer.parseInt(num6);
			int num66=Integer.parseInt(num7);
			double rate5=Double.parseDouble(rate4);
			
			double finalCre3=num55*rate5+(1-rate5)*num66;
			double Finaldit3=finalCre3;
			
			
String name4=jtf13.getText();
			
			String credit4=jtf14.getText();
			String num8=jtf15.getText();
			String num9=jtf16.getText();
			String rate6=jtfd.getText();
			int num77=Integer.parseInt(num8);
			int num88=Integer.parseInt(num9);
			double rate7=Double.parseDouble(rate6);
			
			double finalCre4=num77*rate7+(1-rate7)*num88;
			double Finaldit4=finalCre4;
			
			
			
		
			Display4 d=new Display4(finalCre,finalCre2,finalCre3,finalCre4);
			
			double one=Double.parseDouble(credit1);
			double two=Double.parseDouble(credit2);
			double thr=Double.parseDouble(credit3);
			double four=Double.parseDouble(credit4);
			
			double finaldit=(finalCre*one+finalCre2*two+finalCre3*thr+finalCre4*four)/(one+two+thr+four);
			
			
			Count c=new Count(4,finaldit);
			
			}
			if(num1==5)
			{
			
				String name1=jtf1.getText();
				String credit1=jtf2.getText();
				String num1=jtf3.getText();
				String num2=jtf4.getText();
				String rate=jtfa.getText();
				int num11=Integer.parseInt(num1);
				int num22=Integer.parseInt(num2);
				double rate1=Double.parseDouble(rate);
				
				double finalCre=num11*rate1+(1-rate1)*num22;
				double Finaldit=finalCre;
				
				
				
				

			String name2=jtf5.getText();
			
			String credit2=jtf6.getText();
			String num3=jtf7.getText();
			String num4=jtf8.getText();
			String rate2=jtfb.getText();
			int num33=Integer.parseInt(num3);
			int num44=Integer.parseInt(num4);
			double rate3=Double.parseDouble(rate);
			
			double finalCre2=num33*rate3+(1-rate3)*num44;
			double Finaldit2=finalCre;
		
			
			
String name3=jtf9.getText();
			
			String credit3=jtf10.getText();
			String num6=jtf11.getText();
			String num7=jtf12.getText();
			String rate4=jtfc.getText();
			int num55=Integer.parseInt(num6);
			int num66=Integer.parseInt(num7);
			double rate5=Double.parseDouble(rate4);
			
			double finalCre3=num55*rate5+(1-rate5)*num66;
			double Finaldit3=finalCre3;
			
			
String name4=jtf13.getText();
			
			String credit4=jtf14.getText();
			String num8=jtf15.getText();
			String num9=jtf16.getText();
			String rate6=jtfd.getText();
			int num77=Integer.parseInt(num8);
			int num88=Integer.parseInt(num9);
			double rate7=Double.parseDouble(rate6);
			
			double finalCre4=num77*rate7+(1-rate7)*num88;
			double Finaldit4=finalCre4;
			
			
String name5=jtf17.getText();
			
			String credit5=jtf18.getText();
			String num10=jtf19.getText();
			String num12=jtf20.getText();
			String rate8=jtfe.getText();
			int num888=Integer.parseInt(num10);
			int num999=Integer.parseInt(num12);
			double rate9=Double.parseDouble(rate8);
			
			double finalCre5=num888*rate9+(1-rate9)*num999;
			double Finaldit5=finalCre5;
			
			
			
		
			Display5 d=new Display5(finalCre,finalCre2,finalCre3,finalCre4,finalCre5);
			double one=Double.parseDouble(credit1);
			double two=Double.parseDouble(credit2);
			double thr=Double.parseDouble(credit3);
			double four=Double.parseDouble(credit4);
			double five=Double.parseDouble(credit5);
			
			double finaldit=(finalCre*one+finalCre2*two+finalCre3*thr+finalCre4*four+finalCre5*five)/(one+two+thr+four+five);
			
			
			Count c=new Count(5,finaldit);
			}
			
			
		
		/*
	
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
			
			
			
		
		
		}*/
	}
	
	
	
}
}
