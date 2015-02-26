package sortingArrayUsingLinkList;


public class LinkList {
	private Link first;
	public LinkList()
	{
		first=null;
	}
	public LinkList(Link[] linkArr)
	{
		first=null;
		for(int j=0;j<linkArr.length;j++)
		{
			insert(linkArr[j]);
		}
	}
	
	public boolean isEmpty()
	{
		return(first==null);
	}
	public void insert(Link newlink)
	{
		Link previous=null;
		Link current=first;
		while(current!=null && newlink.data >current.data)
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
	public Link deleteFirst()
	{   
		Link temp=first;
		first=first.next;
		return temp;
	}
	public void deleteAll(Link link)
	{
		Link current =first;
	  //Link temp=null;
		while(current.data!=link.data)
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
