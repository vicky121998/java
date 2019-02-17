import java.util.*;
import java.lang.*;
import java.io.*;
class vk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,c=0;
		String s;
		Scanner v=new Scanner(System.in);
		s=v.nextLine();
		for(i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
		{
			c++;
		}	
		}
	
		System.out.println(c);
	}
}
