import java.util.*;
import java.lang.*;
import java.io.*;
class vk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,f=1,s=1,i,t;
Scanner v=new Scanner(System.in);
n=v.nextInt();
System.out.println(f+"\n"+s);
	for(i=0;i<n-2;i++)
	{
		t=f+s;
		f=s;
		s=t;
		System.out.println(t);
	}

	
		
	}
}
