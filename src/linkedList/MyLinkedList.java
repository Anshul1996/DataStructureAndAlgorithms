package linkedList;

public class MyLinkedList<AnyType> {
	private Node<AnyType> head = null;
	private static class Node<AnyTime>{
		AnyTime data;
		Node<AnyTime> next;
		public Node(AnyTime data)
		{
			this.data =data;
			this.next =null;
		}
	}
	public void printList()
	{
		Node n =head;
		while(n !=  null)
		{
			System.out.print(n.data + "->");
			n=n.next;
		}
		
	}
	public void addLast(AnyType x)
	{
		Node newNode = new Node(x);
		if(head == null)
		{
			head = new Node(x);
			return;
		}
		newNode.next = null;
		Node temp =head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next=newNode;
	}	
	public void addFirst(AnyType x)
	{
		Node newNode = new Node(x);
		newNode.next = head;
		head = newNode;
	}
	public void addAnyWhere(AnyType x, int loc)
	{
		Node newNode = new Node(x);
		if(head == null)
		{
			System.out.println("Cannot Add");
			return;
		}
		Node temp = head;
		int counter = 1;
		while(temp.next != null)
		{
			if(counter ==  loc-1)
			{
				//temp = newNode;
				newNode.next = temp.next;
				temp.next = newNode;
				return;
			}
			temp = temp.next;
			counter++;
		}
	}
	public void deleteData(AnyType x)
	{
		if(head == null)
		{
			System.out.println("No Node to Delete.");
		}
		Node temp = head;
		Node prevNode=null;
		while(temp.next != null)
		{
			
			if(temp.data == x)
			{
				prevNode.next = temp.next;
			}
			prevNode = temp;
			temp=temp.next;
		}
		
	}
	
	
public static void main(String[] args) {
  MyLinkedList llist = new MyLinkedList();
 llist.addLast("A");
 llist.addLast("B");
 llist.addLast("C");
 llist.addLast(1);
 llist.addLast(2);
 llist.addFirst(0);
 llist.addAnyWhere("Z", 2);
 llist.addAnyWhere("U", 4);
 llist.printList();
 llist.deleteData("C");
 System.out.println("");
 llist.printList();
}
}
