package testallclass;

import java.util.Scanner;

public class hackerrank {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
           
   int len= s.length();
   char[] m = s.toCharArray();
   if(len%2==0){
	   for(int i=0;i<len;i++){
		   System.out.println(m[i]);
	   }
	
   }else{
	   System.out.println(s.split(" "));
   }
        
           
    }
}
