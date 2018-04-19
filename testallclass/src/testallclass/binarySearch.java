package testallclass;

import java.lang.reflect.Array;

public class binarySearch {

public static void main(String arg[]){
	
	int [] arry ={1,2,3,4,5,6};
	int fndNo=4;
	System.out.println(serach(arry,fndNo));
}

private static int serach(int[] arry, int fndNo) {
	
	int start=0;
	int end=arry.length-1;
	while(start<=end){
		int mid=(start+end)/2;
		
		if(fndNo==arry[mid]){
			return mid;
		}
		if(fndNo<arry[mid]){
			end=mid-1;
		}else{
			start=mid+1;
		}
	}
	
	
	return -1;
}


}

