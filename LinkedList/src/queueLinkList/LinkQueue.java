package queueLinkList;


public class LinkQueue {

	private LinkList list;
	public LinkQueue()
	{
		list=new LinkList();
		
	}
	public void insert(double data)
	{
		list.insertLast( data);
	}
	public double delete()
	{
		return list.deleteFirst();
	}
    public boolean isEmpty()
    {
    	return list.isEmpty();
    }
    public void displayQueue()
    {
    	System.out.println("Queue:");
    	list.displayLinkList();
    }
}

