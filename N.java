
public class N {

	private Object data;
	private N next = null;
	
	N(int data)
	{
		this.data = data;
	}
	
	N(Object o,N start)
	{    data=o;
	     next=start;
		
	}

	
	public void setNext(N nodeToAdd)
	{
		next = nodeToAdd;
	}
	
	public N getNext()
	{
		return next;
	}
	
	public Object getData()
	{
		return this.data;
	}
	
	public void setData(int dataToSet)
	{
		this.data = dataToSet;
	}
}
