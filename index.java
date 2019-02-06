
import java.util.*;
import java.lang.*;
import java.io.*;
class vk
{
	public static void main (String[] args)
	{
	int i;
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int[] a=new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
	System.out.println(n);
	for(i=0;i<n;i++)
	{
		System.out.println("\n" + a[i]+"\t" +i);
	}
	}
}
