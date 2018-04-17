package testallclass;

public class thrading extends Thread {
	public void run(){
		
		int a=0,b=1,c=1;
		System.out.println("thread is running "+a+b+c);
	}
	
	public static void main(String arg[]){
		thrading ts= new thrading();
		ts.start();
		threading2 ts1= new threading2();
		threading3 ts2= new threading3();
		Thread td= new Thread(ts1);
		Thread td1= new Thread(ts2);
		td.start();
		td1.start();
	}	
}

class threading2 implements Runnable{
	public void run(){
		
		//Thread.sleep(500);
		System.out.println("thread 2 is running ");
	}
	
}
class threading3 implements Runnable{
	public void run(){
		//Thread.sleep(1000);
		System.out.println("thread 3 is running ");
	}
	
}

