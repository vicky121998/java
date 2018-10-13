
import java.util.*;
import java.lang.*;
import java.io.*;

class vk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t=0,j,n,i=0,f;

Scanner sc=new Scanner(System.in);
n=sc.nextInt();
f=n;
int a[]=new int[n];
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}for(i=0;i<n;i++)
{
	for(j=i+1;j<n;j++){
	if(a[i]>a[j])
    {
    t=a[i];
	a[i]=a[j];
	a[j]=t;
    }
}}
for(i=0;i<n-1;i++)
{
System.out.println(a[i]);
}	
System.out.println(a[n-1]);

System.out.println(a[f/2]);
	}
}
