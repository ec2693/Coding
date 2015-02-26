package sortingArrayUsingLinkList;

public class ArrayInsertionSortUsingLinkListApp {
	public static void main(String args[])
	{
		Link[] linkArr=new Link[10];
		for(int i=0;i<linkArr.length;i++)
		{
			int n=(int)(java.lang.Math.random()*99);
			Link newlink=new Link(n);
			linkArr[i]=newlink;
		}
		System.out.println("Unsorted Array:");
		for(int i=0;i<linkArr.length;i++)
			System.out.println(linkArr[i].data);
		System.out.println(" ");
		
		LinkList list=new LinkList(linkArr);
		list.displayLinkList();
		
		for(int i=0;i<linkArr.length;i++)
		{
			linkArr[i]=list.deleteFirst();
		}
		
		System.out.println("Sorted Array:");
		for(int i=0;i<linkArr.length;i++)
			System.out.println(linkArr[i].data);
		System.out.println(" ");
		
	}

}
