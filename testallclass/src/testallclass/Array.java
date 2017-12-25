package testallclass;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	//public static int[] a;//={1,2,3,4,5};

	public static void main(String[] args) {
		int s=0;
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.print("enter values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			//System.out.print(a[i]);
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];
			
			System.out.println(" "+a[i]);
			
		}
		System.out.print(" "+s);
		System.out.println("tostring:"+Arrays.toString(a));
		
	}
	
	
}
