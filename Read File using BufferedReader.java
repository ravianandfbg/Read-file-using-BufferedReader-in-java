//Read File using BufferedReader//

import java.io.*;
public class Read
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			FileReader fr=new FileReader("D:\\testDemo1.txt");
		 BufferedReader br=new BufferedReader(fr);
		 String i;
			while((i=br.readLine())!=null)
				System.out.println(i);
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}