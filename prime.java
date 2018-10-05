import java.util.*;
import java.lang.*;
import java.io.*;
class vk
{
	public static void main (String[] args) throws java.lang.Exception
	{   
		int n,i,flag=0;
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
	      	{
	      	flag=1;
			break;		
		}}
		if(flag==0)
			System.out.println("yes");
			else
			System.out.println("no");
		}
}
