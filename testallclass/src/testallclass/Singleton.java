package testallclass;

public class Singleton {

	private static Singleton ob;
	private Singleton(){
		
	};
	private static Singleton getInstance(){
		int s=0;
		if(ob==null)
		{
			ob = new Singleton();
			System.out.println(s);
		}
		
		
		return ob;	
	}
	
	public static void main(String arg[]){
		Singleton st=  Singleton.getInstance();
		Singleton st1=  Singleton.getInstance();
		Singleton st2=  Singleton.getInstance();
		Singleton st3=  Singleton.getInstance();
	}
	
}
