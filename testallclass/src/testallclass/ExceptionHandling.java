package testallclass;

public class ExceptionHandling {

	public static void main(String[] args)  
    {
        try
        {
        	
           int i =1/0;  
           
         
        }
  
        catch(Exception ex)
        {
        	
            System.out.println("This block handles all exception types"+ex);
            System.exit(5 );
            
            
        }
        catch(ExceptionInInitializerError ex)
        {
        	
            System.out.println("This block handles all exception types"+ex);
            System.exit(1);
            
        }
        
        finally{
        	System.out.println("it is not working");
        	
        }
       
  
    }
	
	
}
