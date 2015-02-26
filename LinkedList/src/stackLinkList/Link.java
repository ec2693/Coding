package stackLinkList;



public class Link {
	//public int id;
	public double data;
	public Link next;
	
	public Link(double data)
	{
		//this.id=id;
		this.data=data;
	}
    public  void displayLink()
    {
    	System.out.println( data );
    }

}
