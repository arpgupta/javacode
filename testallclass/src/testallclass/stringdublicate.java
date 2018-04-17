package testallclass;

public class stringdublicate {

	
	public static void main(String arg[]){
		
		String s= "arpit is good boy arpit is";
		
		String s1[]= s.split(" ");
		int count=0;
		
		for(int i=0;i<s1.length;i++){
			count=0;
			int flag=0;
			for(int k=0;k<i;k++){
				if(s1[k].equals(s1[i])){
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				continue;
			}
			
			for(int j=0;j<s1.length;j++){
				
				if((s1[i].equals(s1[j])))
				{
					count=count+1;					
				}
			}
			System.out.println(s1[i]+"->"+count);
		}
		
	}
	
}
