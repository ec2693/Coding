package queueLinkList;



public class LinkQueueApp {
	public static void main(String args[])
	{
		LinkQueue queue=new LinkQueue();
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		queue.displayQueue();
		
		queue.delete();
		queue.delete();
		queue.displayQueue();
		
	}


}
