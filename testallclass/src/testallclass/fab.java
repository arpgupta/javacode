package testallclass;

public class fab {

	public static void main(String arg[]){
		
		int n=10;
		System.out.println(fabLopp(n));
		System.out.println(fabRec(n));
		
	}

	private static int[] fabRec(int n) {
		int[] fib=new int[n];
		for(int i=2;i<n;i++){
			
			fib[i]= fib[i-1]+fib[i-2];
			
		}
		
		return fib;
		
		
	}

	private static int fabLopp(int n) {
		
		if(n<1)
			return 0;
		if(n<=2)
			return 1;
		
		return fabLopp(n-1)+fabLopp(n-2);
		
	}
	
	
}
