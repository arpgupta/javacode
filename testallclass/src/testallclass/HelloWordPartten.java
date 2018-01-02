package testallclass;
import java.lang.Math;
public class HelloWordPartten {

	
	public static void main(String args[]){
		
		
		leftToRightLine("*", 5);
		TopToLine("*", 4);
		leftToRightLine("*", 5);
	}

	private static void TopToLine(String s, int range) {
		for(int i=0;i<range;i++){
			System.out.println(s);
		}
		
	}


	private static void leftToRightLine(String s, int range) {
		for(int i=0;i<range;i++)
		System.out.print(s);
		
	}
}
