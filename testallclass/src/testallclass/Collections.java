package testallclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Collections {
	class Student{  
		  int rollno;  
		  String name;  
		  int age;  
		  Student(int rollno,String name,int age){  
		   this.rollno=rollno;  
		   this.name=name;  
		   this.age=age;  
		  }  
		}  
	public static void main(String arg[]){
		ArrayList<String> list=new ArrayList<String>();
		
		 list.add("Ravi");  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		
		  Map<Integer,String> map=new HashMap<Integer,String>();  
	}
}
