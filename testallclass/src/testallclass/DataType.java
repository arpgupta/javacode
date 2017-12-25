package testallclass;

public class DataType {

	public static void main(String arg[]){
		
		
		
		
	//byte	2^7 to -2^7-1
		//short	2^15 to -2^15-1
		//int	2^31 to -2^31-1
		//long	2^63 to -2^63-1
		
		
		
		byte by=1;
		System.out.println(by);
		by=127;
		System.out.println(by);
		by++;
		System.out.println(by);
		by++;
		System.out.println(by);
		boolean boo=true;
		if(boo==true)
			System.out.println(boo);
		
		System.out.println("Byte-"+Byte.SIZE+"Max value"+Byte.MAX_VALUE);
		System.out.println("Integer-"+Integer.SIZE+"Max Value "+Integer.MAX_VALUE);
		System.out.println("short-"+Short.SIZE+"Max Value "+Short.MAX_VALUE);
		
		System.out.println("Float-"+Float.SIZE+"Max value "+Float.MAX_VALUE);
		System.out.println("Double-"+Double.SIZE+"Max Value "+Double.MAX_VALUE);
		System.out.println("Long-"+Long.SIZE+"Max Value "+Long.MAX_VALUE);
	
		 char a = 'G';
         
	        int i=89;
	      
	        byte b = 4;
	         
	         
	        short s = 56;
	         
	         
	         
	     
	        double d = 4.355453532;
	         
	     
	        float f = 4.7333434f;
	        
	        System.out.println("char: " + a); 
	        System.out.println("integer: " + i); 
	        System.out.println("byte: " + b); 
	        System.out.println("short: " + s); 
	        System.out.println("float: " + f); 
	        System.out.println("double: " + d); 
		
		
	}
	
}
