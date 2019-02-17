import java.util.*;
import java.lang.*;
import java.io.*;
class vk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,n=0,l=0,w=0,sc=0;
String s;
Scanner v=new Scanner(System.in);
s=v.nextLine();
		for(i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i))){n++;}
			else if(Character.isLowerCase(s.charAt(i))){l++;}
			else if(Character.isWhitespace(s.charAt(i))){w++;}
			else{sc++;}
		}
System.out.println(sc);
	}
}
