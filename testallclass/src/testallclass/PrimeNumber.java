package testallclass;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String arg[]){
		
		int n,a=0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number for check prime or not");
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++){
			
			if(n%2==1){
				a=1;
				System.out.println(n);
			}
			
		}
		if(a==1){
			System.out.println("Prime");
		}else{
			System.out.println("not Prime");
		}
	}
	
	
}
