
import java.util.*;
import java.lang.*;
import java.io.*;
class vk
{
	public static void main (String[] args)
	{
	int h1,m1,m2,h2;
	Scanner in=new Scanner(System.in);
	h1=in.nextInt();
	m1=in.nextInt();
	h2=in.nextInt();
	m2=in.nextInt();
	if(h1>h2)
{	h1=h1-h2;}
	else
	{h1=h2-h1;}
	if(m1>m2)
	{m1=m1-m2;}
	else
	{m1=m2-m1;}
	System.out.println("\n"+h1+"\t"+m1);
	
	}
}
