package testallclass;

public class stack {
 
	private int max;
	private long  arry[];
	private int top;
	
	public  stack(int n) {
			max= n;
		arry = new long[n];
		top=-1;
	}
	
	public void push(long j){
		arry[++top]=j;
	}
	public long pop(){
	return arry[top--];
	}
	
	public boolean isFull(){
		return (top==max-1);
		}
	public boolean isEmpty(){
		return (top==-1);
		}
	
	public static void main(String []ar){
		
	stack	st = new stack(10);
	stack	st1 = new stack(10);
	
	st.push(10);
	st.push(20);
	st.push(30);
	st.push(40);
while(!st.isEmpty()){
	long value=st.pop();
	st1.push(value);
	System.out.println(value);
	
}

while(!st1.isEmpty()){
	long value=st1.pop();
	
	System.out.println(value);
	
}
	}
	
	
}
