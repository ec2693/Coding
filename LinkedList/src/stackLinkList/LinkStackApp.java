package stackLinkList;

public class LinkStackApp {
	public static void main(String args[])
	{
		LinkStack stack=new LinkStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.displayStack();
		
		stack.pop();
		stack.pop();
		stack.displayStack();
		
	}

}
