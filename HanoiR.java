
public class HanoiR {
  public static Stack1 s=new Stack1();
  
  public static int returnvalue;
  public static int count=0;
  
  
   public static void main(String[] args) {
        s.push(new HanoiRecord(4,'a','b','c'));
        
        while(!s.isEmpty()){
        	((HanoiRecord)s.top()).run();
        }
        
        System.out.println("we spend "+count+ " moves to finish the task!");
        
     
	}

}
