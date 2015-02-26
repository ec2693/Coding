package doublyLinkList;

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
    public void insertFirst(int key)
    {
    	Link newlink=new Link(key);
    	if(isEmpty())
    		last=newlink;
    	else
    		first.previous=newlink;
    	newlink.next=first;
    	first=newlink;
    }
    public void insertLast(int key)
    {
    	Link newlink=new Link(key);
    	if(isEmpty())
    		first=newlink;
    	else
    	{
            last.next=newlink;
    	    newlink.previous=last;
    	}
    	last=newlink;
    }
    public Link deleteFirst()
    {
    	Link temp=first;
    	if(first.next==null)
    		last=null;
    	else
    		first.next.previous=null;
    	first=first.next;
    	return temp;
    }
    public Link deleteLast()
    {
    	Link temp=last;
    	if(first.next==null)
    	    first=null;
    	else
    		last.previous.next=null;
    	last=last.previous;
    	return temp;
    	
    }
    public boolean insertAfter(int key1,int key2)
    {
    	
    }
}
