package stackLinkList;

public class LinkList {
	private Link first;
	public LinkList()
	{
		first=null;
	}
	public boolean isEmpty()
	{
	return(first==null);
	}
	public void insertFirst(double data)
	{
		Link newlink=new Link( data);
		newlink.next=first;
		first=newlink;
	}
    public double deleteFirst()
    {
    	Link temp=first;
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



