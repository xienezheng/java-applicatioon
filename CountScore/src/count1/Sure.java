package count1;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Sure extends JFrame {
	String s;
	public Sure()
	{
		JFrame jf=new JFrame();
		int i=0;
		
		i=JOptionPane.showConfirmDialog(jf, "启动成绩计算器？","",JOptionPane.OK_CANCEL_OPTION);
		if(i==0)
		{
			
		
			System.out.println("已成功启动");
			JFrame jf1=new JFrame();
			s=JOptionPane.showInputDialog(jf1, "您要计算几门学科的成绩？","科目数必须在1-5门之间",JOptionPane.INFORMATION_MESSAGE);	
		
			System.out.println(s);
			int temp;
		
			temp=Integer.parseInt(s);
			if(s.isEmpty()||temp<1||temp>5)
			{
			JOptionPane.showMessageDialog(jf1,"科目数必须在1-5门之间，请正确输入","",JOptionPane.INFORMATION_MESSAGE);
			}
			else{
			
			JOptionPane.showMessageDialog(jf1,"已成功启动","",JOptionPane.INFORMATION_MESSAGE);
			Gui temp9=new Gui(s);
			}
	}
		
	
		
		
		
	}

	public static void main(String args[])
	{
		Sure g=new Sure();
	}
}
