package testallclass;

import java.util.HashSet;
import java.util.Set;

public class DublicateElementinarry {

	
	public static void main(String arg[]){
		
	int arry[]= {1,1,2,3,4,5,6,7,8,8,5,2,6};
	
	int len= arry.length;
	
	String s= "aaabbbbcccddd";
	int Slen=s.length();
	char []ch=s.toCharArray();
	//dublicateByset(arry ,len);
	//dublicateByarray(arry ,len);
	dublicateByChararray(ch,Slen);
	
	}

	private static void dublicateByset(int[] arry, int len) {
		Set<Integer> set1 = new HashSet<Integer>();
		for(int i=0;i<len;i++){
			int count=1;
				if(set1.add(arry[i])==false){
					count=count+1;
					System.out.println(arry[i]+"time"+count);
				}
		}
	}
	private static void dublicateByarray(int[] arry, int len) {
		
		for(int i=0;i<len-1;i++){
			int count=1;
			for(int j=i+1;j<len;j++){
				if((arry[i]==arry[j])&&(i!=j)){
					count=count+1;
					System.out.println(arry[j]+"time"+count);
				}
			}
		}
		
		
	}
private static void dublicateByChararray(char[] arry, int len) {
		
		for(int i=0;i<len-1;i++){
			
			for(int j=0;j<len;j++){
				if((arry[i]==arry[j])&&(i!=j)){
					
					System.out.println(arry[j]);
				}
			}
		}
		
		
	}
}

