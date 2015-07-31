
public class HanoiRecord extends ActivationRecord{
	private int n;
	private int line=0;
	private char a,b,c;
	public HanoiRecord(int newN,char location1,char location2,char location3)
	{    n=newN;
	     a=location1;
	     b=location2;
	     c=location3;
	     //line=0;
		
	}
    
	
	public void run()
	{
		switch (line){
		case 0:
			if(n==1)
			{  System.out.println("move disk 1 from " +a+ " to "+b);
			    HanoiR.s.pop();	
			    return;
			    
			}
			line=1;
			//HanoiR.s.pop();
			HanoiR.s.push(new HanoiRecord(n-1,a,c,b));
			
		    //line=1;
		    return;
		case 1:
			System.out.println(" Move disk " + n + " from " + a +
					" to " + b);
			line =2;
			//HanoiR.s.pop();
			HanoiR.s.push(new HanoiRecord(n-1,c,b,a));
			return;
		case 2:
			HanoiR.s.pop();
			return;
		}
		
	
			}
	
       private void move()
       {
    	   hanoi(n,a,b,c);
       }

	private void hanoi(int i, char source, char temp, char dest) {
		if (i == 1) {
			System.out.println(" Move disk 1 from " + source + " to " + dest);
			}
			else {
			hanoi(i - 1, source, temp, dest);
			System.out.println(" Move disk " + i + " from " + source +
			" to " + dest);
			hanoi(i - 1, temp, dest, source);
			}
		
	}
	
	
}
