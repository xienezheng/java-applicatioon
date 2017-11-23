package Try;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class New1 {
	 public String name;
		public New1(String s)
		{
			name=s;
			
		}
		public String getName()
		{
			return name;
		}
		
		
		public  void new1()
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
			
		}

}
