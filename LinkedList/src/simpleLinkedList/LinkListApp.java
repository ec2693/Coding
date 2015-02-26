 package simpleLinkedList;

public class LinkListApp {
	public static void main (String args[])
	{
		LinkList list=new LinkList();
		list.insertFirst(1, 10);
		list.insertFirst(2, 20);
		list.insertFirst(3, 30);
		list.insertFirst(4, 40);
		list.insertFirst(5, 50);
		list.insertFirst(6, 60);
		list.insertFirst(7, 70);
		list.insertFirst(8, 80);
		
		list.displayLinkList();
		
	  // while(!list.isEmpty())
	  // {
		   //Link alink=list.specDelete(1);
		  // Link blink=
				   list.specDel(7);
		   //System.out.println("Deleted Link:");
		  // blink.displayLink();
	  // }
	   list.displayLinkList();
	}

}
