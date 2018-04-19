package testallclass;

public class palindrome {

	 static void palindrome(int a){
		 int r,sum=0,temp;
		 temp=a;
		 while(a>0){
			 r=a%10;
			 sum=(sum*10)+r;
			 a=a/10;
		 }
		 if(temp==sum){
			 System.out.println("palindrome number ");  
		 }else{
			 System.out.println("not palindrome");    
		 }   
   
	 	}  
		
	
	
	public static void main(String arg[]){
		int n=153;
		//palindrome(n);
		ArmstrongNo(n);
	}



	private static void ArmstrongNo(int n) {
		 int r,sum=0,temp;
		 temp=n;
		 while(n>0){
			 r=n%10;
			 n=n/10;
			 sum=sum+(r*r*r);
		 }
		 if(temp==sum){
			 System.out.println("armstrong number ");  
		 }else{
			 System.out.println("not armstrong");    
		 } 
		
	}
	
}
