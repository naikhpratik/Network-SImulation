import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class variableinput {
	
	public static ArrayList<String> arrlist = new ArrayList<String>();	
	public static int operations(StringBuilder mainHex) throws IOException
	{
		String hold = new String();
		for(int i=2;i<mainHex.length();i++)
		{
			if(mainHex.charAt(i) == '4')
			{
				if((i+1)<mainHex.length() && mainHex.charAt(i+1) == 'A')
				{
					//System.out.println(mainHex.charAt(i-1));
					hold = mainHex.substring(0, (i));
					arrlist.add(hold);
					//hold = mainHex.substring(0, (i));
					//System.out.println(hold);
					int len = hold.length();
					//System.out.println(i);
					mainHex = mainHex.delete(0,len);
					//operations(mainHex);
				}
				if (i == mainHex.length()-1)
				{
					//System.out.println(mainHex.charAt(i));
					hold = mainHex.substring(0, i+1);
					arrlist.add(hold);
					//hold = mainHex.substring(0, (i));
					//System.out.println(hold);
					int len = hold.length();
					//System.out.println(i);
					mainHex = mainHex.delete(0,len);
					System.out.println("LENGTH : "+mainHex.length());
					break;
				}
			}
		}
		return arrlist.size();
    }
}
