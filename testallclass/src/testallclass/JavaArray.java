package testallclass;

import java.util.Scanner;

public class JavaArray {

	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of array");
		int n= s.nextInt();
		
		int arry[] = new int[n];
		System.out.println("enter the element of array");
		for(int i=0;i<n;i++){
			arry[i]=s.nextInt();
		}
		for(int i=n-1;i>=0;i--){
			System.out.print(arry[i]);	
		}
		
		
	}
	

}
