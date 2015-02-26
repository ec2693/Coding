package simpleLinkedList;

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
	public void insertFirst(int id,double data)
	{
		Link newlink=new Link(id,data);
		newlink.next=first;
		first=newlink;
	}
    public Link deleteFirst()
    {
    	Link temp=first;
    	first=first.next;
    	return temp;
    }
    public Link specDel(int id)
    {
    	Link current=first;
    	Link previous=first;
   	 while(current.id!=id)
   	 {
   		 if (current.next==null)
   				 return null;
   		 else 
   		 {
   			 previous=current;
   		     current=current.next;
   		 }
   	 
     }
   	 if (current== first)
   	 {
   	    first=first.next;
   	 }
   	 else
   	 {
   	     previous.next=current.next;
   	 }
   	 return current;
   	 
    }
    
    public Link find(int id)
    {
    	 Link current=first;
    	 while(current.id!=id)
    	 {
    		 if (current.next==null)
    				 return null;
    		 else
    			 current=current.next;
    	 }
    	 return current;
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
