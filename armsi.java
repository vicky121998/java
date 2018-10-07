import java.util.*;
import java.lang.*;
import java.io.*;
class vk
{
	public static void main (String[] args) throws java.lang.Exception
	{ int a,b,t,r,s=0,i;
         Scanner v = new Scanner(System.in);
          a = v.nextInt();
          b= v.nextInt();
          for(i=a+1;i<b;i++)
{         
	t=i;
          while(t!=0)
          {
          	r=t%10;
          	s=s+r*r*r;
          	t=t/10;
          }
          if(i==s)
          System.out.println(i);
         s=0;
}
}}
