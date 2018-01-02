package testallclass;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String arg[]){
		
	int n; 

	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter the No to Get Fib Series");
	n=sc.nextInt();
	int expression=1;
	switch(expression){    
	case 1:    fab1(n);
	 //code to be executed;    
	 break;  //optional  
	case 2:    
	    fab2(n);
	}    
	
	
	}

	static int n1=0;
	static int n2=1;
	static int n3;
	
	private static void fab2(int n) {
		System.out.println(n1);
		System.out.println(n2);
		
		if(n>0){
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			fab2(n-1);
		}
		
	}

	

	public static void fab1(int j) {
		int n1=0,n2=1,n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0;i<j;i++){
			
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
}
