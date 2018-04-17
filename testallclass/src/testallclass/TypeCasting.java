package testallclass;

public class TypeCasting {
 public static void main(String arg[]){
	 
//	 double>float>long>int>short>byte
	/* int i=5;
	 byte by=1;
	 short sh =2;
	 double d=7;
	 float f=5.5155115f;
	 int j=(byte) by;
	 char ch='a';
	 int chtoint=ch;
	 String s="abc";
	  chtoint=(int)ch;
	 System.out.println(i);
	 System.out.println(by);
	 System.out.println(sh);
	 System.out.println(d);
	 System.out.println(f);
	 System.out.println(j);
	 System.out.println(chtoint);*/
	 StackClass st= new StackClass(10);
	 
	 StackClass st1= new StackClass(10);
	 	st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		
		
		while(!st.isEmpty()){
			long value= st.pop();
			st1.push(value);
			System.out.println(value);
		}
		System.out.println("using 2 stack");
		while(!st1.isEmpty()){
			long value= st1.pop();
			
			System.out.println(value);
		}
		
	}
	 
	 
 }

