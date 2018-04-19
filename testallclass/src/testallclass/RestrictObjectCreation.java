package testallclass;

public class RestrictObjectCreation {
	  
    private static RestrictObjectCreation myObj;
    
    private RestrictObjectCreation(){
         
    }
   static int count=0,i=0;
    public static RestrictObjectCreation abc(){
        if(count<5){
            myObj = new RestrictObjectCreation();
            count++;
            System.out.println(count);
        }
        return myObj;
    }
     
    public void getSomeThing(){
        // do something here
    	
        System.out.println("I am here....");
    }
    public static void main(String a[]){
    	RestrictObjectCreation st = RestrictObjectCreation.abc();
        //st.getSomeThing();
        RestrictObjectCreation st1 = RestrictObjectCreation.abc();
        //st1.getSomeThing();
        RestrictObjectCreation st3 = RestrictObjectCreation.abc();
        //st3.getSomeThing();
        RestrictObjectCreation st4 = RestrictObjectCreation.abc();
        //st4.getSomeThing();
        RestrictObjectCreation st5 = RestrictObjectCreation.abc();
        //st5.getSomeThing();
        RestrictObjectCreation st6 = RestrictObjectCreation.abc();
        
        //st6.getSomeThing();
        RestrictObjectCreation st7 = RestrictObjectCreation.abc();
        //st7.getSomeThing();
    }
}

