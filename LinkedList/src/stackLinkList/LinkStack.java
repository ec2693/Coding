package stackLinkList;

public class LinkStack {
	private LinkList list;
	public LinkStack()
	{
		list=new LinkList();
		
	}
	public void push(double data)
	{
		list.insertFirst( data);
	}
	public double pop()
	{
		return list.deleteFirst();
	}
    public boolean isEmpty()
    {
    	return list.isEmpty();
    }
    public void displayStack()
    {
    	System.out.println("Stack:");
    	list.displayLinkList();
    }
}
