/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class vk
{
	public static void main (String[] args) throws java.lang.Exception
	{
int n,i=0,max=0;

Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
max=a[0];
for(i=0;i<n;i++)
{
if(max<a[i])

	max=a[i];
}
System.out.println(max);
}}
