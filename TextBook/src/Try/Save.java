package Try;
import java.io.*;
public class Save {
	 public String name,text;
	public Save(String s,String s1)
	{
		name=s;
		text=s1;
	}
	public String getName()
	{
		return name;
	}
	public String getText()
	{
		return text;
	}
	
	public  void save()
	{
		
		File f=new File("F:/textbook",name);
		if(!f.exists())
		{
			try
			{
				f.createNewFile();
			}catch(IOException e1)
			{
				
			}
		}
		try
		{
		FileWriter fw=new FileWriter(f,true);
		
try
{
		fw.write(text);
			
		
		}catch(Exception e5)
		{
			
		}
		finally
		{
			fw.close();
		}
	}catch(Exception e6)
		{
		
		}
	}
}
