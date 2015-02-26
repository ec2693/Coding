package doublyLinkList;

public class Link {
	int data;
	Link next;
	Link previous;
    public Link(int data)
       {
		this.data=data;
	   }
	public void displayLink()
    {
    	System.out.println( data );
    }
}
