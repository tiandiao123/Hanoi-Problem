import java.util.Scanner;
public class switchnumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a number<=999 ");
		num=keyboard.nextInt();
		longhand(num);

	}
	
	
	public static void longhand(int n)
	{  int hdigit=n/100;
	    if(hdigit!=0)
	    {
	    	System.out.print(hundreddigit(hdigit)+" hundred ");
	    }
	    
	    int digit21=n%100;
	    if(digit21<20&&digit21>0)
	    {
	    	System.out.println(tenone(digit21));
	    }
	    else
	        {    int tenthdigit=digit21/10;
	             System.out.print(tendigit(tenthdigit)+" ");
	             int lastdigit=digit21%10;
	             if(lastdigit!=0)
	            	 System.out.println(hundreddigit(lastdigit));
	        }
	}
	
	
	 public static String hundreddigit(int a)
	    {     String str1="0";
	        switch (a){
	        case 1: str1="one";
	               break;
	        case 2: str1="two";
	              break;
	        case 3:str1="three";
	             break;
	        case 4: str1="four";
	               break;
	        case 5: str1="five";
	                 break;
	        case 6: str1="six";
	              break;
	        case 7:str1="seven";
	               break;
	        case 8:str1="eight";
	              break;
	        case 9: str1="nine";
	             break;
	       default:
	               break;
	               
	        }     
	        
	        return str1;     
	             
	    }    
	 
	    public static String tenone(int a)
	    {    String str1="0";
	        switch (a){
	        case 1: str1="one";
	               break;
	        case 2:str1="two";
	              break;
	        case 3: str1="three";
	               break;
	        case 4: str1="four";
	              break;
	        case 5: str1="five";
	              break;
	        case 6: str1="six";
	               break;
	        case 7:  str1="seven";
	              break;
	        case 8:   str1="eight";
	              break;
	        case 9:  str1="nine";
	               break;
	        	     
	        case 10: str1="ten";
	                break;
	        case 11: str1="eleven";
	             break;
	        case 12:   str1="twelve";
	                  break;
	        case 13: str1="thirteen";
	               break;
	        case 14: str1="fourteen";
	                 break;
	        case 15: str1="fifteen";
	               break;
	        case 16: str1="sixteen";
	              break;
	        case 17:str1="seventeen";
	                 break;
	        case 18:str1="eighteen";
	               break;
	        case 19: str1="nineteen";
	                break;
	        default:
	               break;
	        }
	        return str1;     
	                  
	     }   
	    public static String tendigit(int a)
	    {     String str1="0";
	        switch (a){
	        
	        case 2: str1="twenty";
	              break;
	        case 3:str1="thirty";
	             break;
	        case 4: str1="forty";
	               break;
	        case 5: str1="fifty";
	                 break;
	        case 6: str1="sixty";
	              break;
	        case 7:str1="seventy";
	               break;
	        case 8:str1="eighty";
	              break;
	        case 9: str1="ninety";
	             break;
	       default:
	               break;
	               
	        }     
	        
	        return str1;     
	             
	    } 
	       

}
