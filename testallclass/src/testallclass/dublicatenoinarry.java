package testallclass;

public class dublicatenoinarry {

	public static void main(String arg[]){
		
		int ar[]= {0,0,0,0,1,0};
		int len= ar.length;
		String pos="";
		int count=0;
		
		for(int i=0;i<len;i++){
			pos="";
			count=0;
			int flg=0;
			for(int k=0;k<i;k++)
			{
				if(ar[k]== ar[i])
				{
					flg=1;
					break;
				}
			}
			if(flg==1)
			{
				continue;
			}
			
			for(int j=0;j<len;j++){

				
				if(ar[j]==ar[i])
				{
					pos=pos+j+",";
					count=count+1;
				}
			}
			
			if(count>0){
				System.out.println(ar[i]+"->"+pos+"->"+count);
			}
			
		}
	}
}
