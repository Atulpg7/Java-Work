package Collections;


class CustomStack<E>{
	
	Node head;
	
	
	
	//Node class
	class Node{
		E data;
		Node next;
		
		Node(E data)
		{
			this.data=data;
			next=null;
		}
	}

	
	
	//Fn Check
	private boolean isEmpty() {
		return head == null;
	}



	
	//Fn Push
	public void push(E item)
	{
		Node newNode=new Node(item);
		
		if(isEmpty())
		{
			head=newNode;
			return;
		}
		
		
		Node temp=head;
		
		while(temp.next!=null)
			temp=temp.next;
		
		temp.next=newNode;
	}
	
	
	//Fn Pop
	public E pop() throws Exception
	{
		E item;
		Node temp=head;
		
		
		if(isEmpty())
			throw new Exception("Can't Pop no element in Stack ....");
		
		
		
		if(head.next==null)
		{
			item=head.data;
			head=null;
			return item;
		}
		
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		
		item=temp.next.data;
		
		temp.next=null;
			
		return item;
	}
	
	
	//Fn Peek
	public E peek()
	{
		Node temp=head;
		if(temp.next==null) {
			return temp.data;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		return temp.data;
	}
	
		
		
}
public class Stack {

	public static void main(String[] args) throws Exception{
		
		
		CustomStack<Integer> stack=new CustomStack<>();
		
		stack.push(10);
		stack.push(20);
		
		int popped= (int) stack.pop();
		System.out.println("Popped: "+popped);
		
		int peek= (int) stack.peek();
		System.out.println("Peek: "+peek);
	
		

	}

}
