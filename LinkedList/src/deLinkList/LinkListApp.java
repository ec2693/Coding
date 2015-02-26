package deLinkList;

public class LinkListApp {
	public static void main (String args[])
	{
		LinkList list=new LinkList();
		list.insertFirst(1, 10);
		list.insertFirst(2, 20);
		list.insertFirst(3, 30);
		list.insertFirst(4, 40);
		list.insertLast(5,50);
		list.insertLast(6, 60);
		list.insertLast(7, 70);
		list.insertLast(8, 80);
		
		list.displayLinkList();

		list.deleteAll(7);
		list.displayLinkList();
		
}
}
