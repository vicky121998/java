import java.util.*;
import java.lang.*;
import java.io.*;
class vk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1,s2;
		int l1,l2;
		Scanner x=new Scanner(System.in);
		s1=x.next();
		s2=x.next();
		l1=s1.length();
		l2=s2.length();
		if(l1>=l2)
		{
			System.out.println(s1);
		}
		else
		{
			System.out.println(s2);
		}
		
	}
}
