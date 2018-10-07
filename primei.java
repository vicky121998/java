import java.util.*;
import java.lang.*;
import java.io.*;
class vk
{
	public static void main (String[] args) throws java.lang.Exception
	{ int a,b, flag = 0, i, j;
         Scanner s = new Scanner(System.in);
          a = s.nextInt();
         b = s.nextInt();
        for(i = a+1; i < b; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
	}
}
