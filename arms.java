import java.util.*;
import java.lang.*;
import java.io.*;
class vk
{
	public static void main (String[] args) throws java.lang.Exception
	{ int a,t,r,s=0;
         Scanner v = new Scanner(System.in);
          a = v.nextInt();
          t=a;
          while(t!=0)
          {
          	r=t%10;
          	s=s+r*r*r;
          	t=t/10;
          }
          if(s==a)
          System.out.println("yes");
         else
         System.out.println("no");
}}
