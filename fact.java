import java.util.*;
import java.lang.*;
import java.io.*;
class vk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int f=1,n,i;
Scanner a=new Scanner(System.in);
n=a.nextInt();
if(n==1)
{
	System.out.println("1");
}
else
{
	for(i=1;i<=n;i++)
	{
		f=f*i;
		}
		System.out.println(f);
}
	}
}
