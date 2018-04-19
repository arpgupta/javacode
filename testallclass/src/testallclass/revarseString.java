package testallclass;

import java.util.Scanner;

public class revarseString {

	public static void main(String arg[]){
		
		System.out.println("enter the string");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		
		char ch[]= s.toCharArray();		
			
		int len=ch.length;
		
		System.out.println(len);
		for(int i=len-1;i>=0;i--){
			System.out.print(ch[i]);
		}
	}
	
}
