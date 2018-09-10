import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 class vk
{
	public static void main (String[] args) 
	{
 
		Scanner v=new Scanner(System.in);
		int n=v.nextInt();
		if(n>0)
		System.out.printf("Positve");
		else if(n==0)
		System.out.printf("Zero");
		else
		System.out.printf("Negative");
	}
}
