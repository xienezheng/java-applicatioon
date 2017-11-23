package Try;
import java.io.*;
public class Open {
	String name;
	String text="";
	public Open(String s)
	{
		name=s;
		System.out.println(name);
	}
	public String open()
	{
		File f=new File("F:/textbook",name);
		if(!f.exists())
		{
			return null;
		}
	try
	{
	FileReader fr=new FileReader(f);
	int s;
	
	try
	{
		while(fr.ready())
		{
			s=fr.read();
			text=text+(char)s;
			System.out.println((char)s);
			
			
		}
		
	}catch(Exception e)
	{
		
	}
	finally
	{
		fr.close();
	}
	}
	catch(Exception e8)
	{
		
	}
	
	return text;
	}
	

}
