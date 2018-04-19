package testallclass;

public class findtoptwono {

	public void printmaxtwono(int[] arry){
		int max1=0;
		int max2=0;
		for(int n:arry){
			if(max1<n){
				max2=max1;
				max1=n;
			}else if(max2<n){
				max2=n;
			}
		}
		System.out.println("First Max Number: "+max1);
        System.out.println("Second Max Number: "+max2);
	}
	public static void main(String arg[]){
		int num[] = {1,2,3,5,7};
		findtoptwono tmn = new findtoptwono();
        tmn.printmaxtwono(num);
	}
}
