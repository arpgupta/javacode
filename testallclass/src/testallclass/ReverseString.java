package testallclass;

public class ReverseString {

	public static void main(String arg[]){
	
		String s="arpit gupta";
		char [] ch= s.toCharArray();
		
		for(int i= ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
	}
	
}
