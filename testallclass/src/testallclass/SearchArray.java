package testallclass;

public class SearchArray {

	
	public static void main(String arg[]){
	int[] arry ={1,2,3,4,5,7,9,1,5};
	int findNo=7;
	
	for(int i=0;i<arry.length;i++){
		if(findNo==arry[i]){
			System.out.println("the no is"+findNo+"in the index:"+ ++i);
		}
		
	}
	
	
}
}
