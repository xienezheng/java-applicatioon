package count1;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Count extends JFrame{
JPanel jp=new JPanel();
JTextArea jta=new JTextArea();
 public int num;
 public double count;
 float countfinal;
public Count(int num1,double count1)
{
	num=num1;
	if(count1<60)
	{
		countfinal=0;
	}
	else if(count1>=60&&count1<65)
	{
		countfinal=1.0f;
	}
	else if(count1>=65&&count1<70)
	{
		countfinal=1.5f;
	}
	else if(count1>=70&&count1<75)
	{
		countfinal=2.0f;
	}
	else if(count1>=75&&count1<80)
	{
		countfinal=2.5f;
	}
	else if(count1>=80&&count1<85)
	{
		countfinal=3.0f;
	}
	else if(count1>=85&&count1<90)
	{
		countfinal=3.5f;
	}
	else if(count1>=90&&count1<95)
	{
		countfinal=4.0f;
	}
	else if(count1>=95&&count1<100)
	{
		countfinal=4.5f;
	}
	else if(count1==100)
	{
		countfinal=5.0f;
	}
	else
	{
		count=-1f;
	}
	this.setVisible(true);
	this.setBounds(100,510,850,100);
	this.setTitle("总体统计");
	this.add(jp);
	jp.add(jta);
	jta.setBounds(10,10,300,70);
	jta.setText(num1+"门科目的平均绩点为"+countfinal);
	
	
}

}
