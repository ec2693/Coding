package queueLinkList;


public class LinkList {
	private Link first;
	private Link last;
	public LinkList()
	{
		first=null;
		last=null;
	}
	public boolean isEmpty()
	{
	return(first==null);
	}
	
	public void insertLast(double data)
	{
		Link newlink=new Link( data);
		if(isEmpty())
			first=newlink;
		else
		    last.next=newlink;
		last=newlink;
	}
    public double deleteFirst()
    {
    	Link temp=first;
    	if(first.next==null)
    		last=null;
    	first=first.next;
    	return temp.data;
    }
    public void displayLinkList()
    {
    	Link current=first;
    	while(current!=null)
    	{
    		current.displayLink();
    		current=current.next;
        }
    	System.out.println(" ");
    }

}
