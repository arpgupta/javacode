package testallclass;

public class Stack {
	public static void main(String arg){
		StackClass st= new StackClass(10);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		while(!st.isEmpty()){
			long value= st.pop();
			
			System.out.println(value);
		}
		
	}
	
	
	
}
