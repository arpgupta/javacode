package testallclass;

public class PlayWithNumber {

private static final String Pair = null;

public static void main(String arg[]){
	
	int a=123;
	PlayWithNumber sn=new PlayWithNumber();
	
 System.out.println(sn.Reverse_No(a));
  int []abc=new int [2]; 
  abc=sn.swap_no(10,20);
  for(int i=0;i<abc.length;i++)
  {
	 System.out.println(abc[i]);
  }
 
 System.out.println("sum of+"+sn.sumOfDigit(a));
}


int Reverse_No(int n){
		 
		int temp = 0, rem=0;
		while(n!=0){
			rem=n%10;
			temp=temp*10+rem;
			n=n/10;
		}
		
		return temp;
	 }
	
	
	
	 int[] swap_no(int a,int b){
		
		int a1=a;
		int b1=b;
		int c=0;
		c=a1;
		a1=b1;
		b1=c;
		
		int[] d = new int[2];
		d[0]=a1;
		d[1]=b1;
		return d;
		
	}
	 
	 int temp=0 ;
	 int  sumOfDigit(int n){
		 if(n==0){
			 return temp;
		 }else{
			 temp=n%10;
			 temp=temp+n;
			 n=n/10;
			 return sumOfDigit(n);
		 }
	 }
	
	
}
