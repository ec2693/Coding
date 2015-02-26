package sortedList;

public class LinkListApp {
	public static void main (String args[])
	{
		LinkList list=new LinkList();
		list.insert(15);
		list.insert(25);
		list.displayLinkList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.displayLinkList();
		list.deleteAll(15);
		list.displayLinkList();
		
}
}