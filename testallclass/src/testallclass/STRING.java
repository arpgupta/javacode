package testallclass;

public class STRING {
public static void main(String arg[]){
char ch[] = {'M','y',' ','J','a','v','a',' ','e','x','a','m','p','l','e'};
	
	String as= String.copyValueOf(ch);
	 System.out.println(as);
	 
	 String b = "jump ";
     String c = "No jump";
     /**
      *  We can do string concatination by two ways. 
      *  One is by using '+' operator, shown below. 
      */
     String d = b+c;
     System.out.println(d);
     /**
      *  Another way is by using concat() method, 
      *  which appends the specified string at the end.
      */
     d = b.concat(c);
     System.out.println(d);
     
     
     String str = "Copy chars from this string";
     char[] ad = new char[10];
     /**
      * The getChars() method accepts 4 parameters
      * first one is the start index from string
      * second one is the end index from string
      * third one is the destination char array
      * forth one is the start index to append in the 
      * char array.
      */
     str.getChars(5, 10, ad, 1);
     System.out.println(ad);
     
     System.out.println(str.replace("Copy", "arpit"));
     
     String acv = "Copy chars from this string";
     
     System.out.println(acv.trim());
     
     String str1 = "This is %s  format example";
     System.out.println(String.format(str1, "string"));
     
}

	
	
}
