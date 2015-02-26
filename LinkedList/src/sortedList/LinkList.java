package sortedList;


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
	public void insert(int data)
	{
		Link newlink=new Link(data);
		Link previous=null;
		Link current=first;
		while(current!=null && data >current.data)
		{
			previous=current;
			current=current.next;
		}
		if(previous==null)
			first=newlink;
		else
		   previous.next=newlink;
		newlink.next=current;
		
	}
	public void deleteAll(int data)
	{
		Link current =first;
	  //Link temp=null;
		while(current.data!=data)
		    {
			current=current.next;
			}
			current.data=current.next.data;
			current.next=current.next.next;
			return;
	}
		
	 public void displayLinkList()
	    {
	    	System.out.println("List(first---->last): ");
	    	Link current=first;
	    	while(current!=null)
	    	{
	    		current.displayLink();
	    		current=current.next;
	        }
	    	System.out.println(" ");
	    }  

	

}
