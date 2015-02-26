package deLinkList;





public class LinkList {
	private Link first;
	private Link last;

	public LinkList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int id, double data) {
		Link newlink = new Link(id, data);
		if (isEmpty())
			last = newlink;
		newlink.next = first;
		first = newlink;
	}

	public void insertLast(int id, double data) {
		Link newlink = new Link(id, data);
		if (isEmpty())
			first = newlink;
		last.next = newlink;
		last = newlink;

	}

	public Link deleteFirst() {
		Link temp = first;
		if (first.next == null)
			last = null;
		first = first.next;
		return temp;
	}

	/*
	   doesnt work with double ended
	   public Link deleteLast() {
		Link temp = last;
		last = null;
		return temp;
	}*/
      //All cases working
	public Link specDelete(int id) {
		Link current = first;
		Link previous = first;
		while (current.id != id) {
			if (current.next == null)
				return null;
			else {
				previous = current;
				current = current.next;
			}

		}
		if (current == first) {
			first = first.next;
		} else {
			previous.next = current.next;
		}
		return current;

	}

	public Link find(int id) {
		Link current = first;
		while (current.id != id) {
			if (current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}

	public void displayLinkList() {
		System.out.println("List(first---->last): ");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println(" ");
	}

	
	public void deleteAll(int key)
{
		Link current =first;
		//Link temp=null;
		while(current.id!=key)
	    {
			
			current=current.next;
			
			
		}
			    
				current.id=current.next.id;
				current.data=current.next.data;
				current.next=current.next.next;
				return;
				
		
		}
	
	  


}
	