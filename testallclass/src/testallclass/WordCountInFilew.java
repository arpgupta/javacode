package testallclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class WordCountInFilew {

	public static void main(String arg[]){
		
		BufferedReader re= null;
		int count=0;
		int word=0;
		int line=0;
		try{
			
		    re= new BufferedReader(new FileReader("C:\\Users\\jyotsna.anand\\Desktop\\text.txt"));
		    
		    String s= re.readLine();
		    
		    while(s!=null){
		    	line++;
		    	String [] w =s.split("");
		    	word=word+w.length;
		    	
		    	s = re.readLine();
		    	
		    }
		    System.out.println("Number Of Chars In A File : "+count);
            
            System.out.println("Number Of Words In A File : "+word);
             
            System.out.println("Number Of Lines In A File : "+line);
           
		
		
		}catch (IOException e) {
			e.printStackTrace();
		}
		 finally
	        {
	            try
	            {
	            	re.close();           //Closing the reader
	            }
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	}
	
}
