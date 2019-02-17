import java.util.*;
import java.lang.*;
import java.io.*;
class vk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,l;
Scanner v=new Scanner(System.in);
n=v.nextInt();
l=v.nextInt();	
n=n^l;
l=n^l;
n=n^l;
	
		System.out.println(n+"\t"+l);
	}
}
