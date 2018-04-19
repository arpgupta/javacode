package testallclass;

import java.util.Scanner;

public class New1 {
	public static void main(String[] args)
	{
		int[] a;//={1,2,3,4,5};
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=new int[n];
		System.out.println("enter elments:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("elemnt u want to enters");
		int x=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				System.out.println("index"+(i+1));
			}
		}
			 
	}

	}
