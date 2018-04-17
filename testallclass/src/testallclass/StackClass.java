package testallclass;

public class StackClass {
	private int maxsize;
	private long[] Stackarry;
	private int top;
	
	public StackClass(int s){
		maxsize=s;
		Stackarry= new long[maxsize];
		top=-1;
	}
	public void push(long j){
		Stackarry[++top]=j;
	}
	public long pop(){
		return Stackarry[top--];
	}
	public long peek(){
		return Stackarry[top];
	}
	public boolean isEmpty(){
		return(top==-1);
	}
	public boolean isFull(){
		return(top==maxsize-1);
	}
}
