package testallclass;

import java.util.Scanner;

public class searchArry {

	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inter the lenght of array");
		int n=sc.nextInt();
		int arry[]= new int[n];
		
		
		System.out.println("enter the array in array");
		for(int i=0;i<n;i++){
			arry[i]=sc.nextInt();
		}
		System.out.println("enter the find no in array");
		
		int f=sc.nextInt();
		
		SearchArry(arry , n,f);
		
		
		
		
		
	}

	private static void SearchArry(int[] arry, int n, int f) {
		int b=1,c=0;
		for(int i=0;i<n;i++){
			if(arry[i]==f){
				b=0;
				c=i;
			}
		}
		if(b==0){
			System.out.println(f+" is present in this arry at "+ ++c +" position" );
		}else{
			System.out.println("it is not present");
		}
		
	}
	
	
}
