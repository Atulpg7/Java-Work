package vivek;

import java.util.*;

class MyQueue<E>{	
	
	//Node For Queue
	static class Queue<E>{
		E data;
		Queue<E> next;
		
		Queue(E data)
		{
			this.data=data;
			next=null;
		}
		
	}
	
	
	
	//Front and Rear for Addition and Deletion
	private Queue<E> rear;
	private Queue<E> front;
	
	
	
	
	//Fn for Insert Elements.
	public void insertElementEnd(E item)
	{
		Queue<E> toAdd=new Queue<E>(item);
		
		if(rear==null)
		{
			rear=toAdd;
			front=toAdd;
			return;
		}
		
		Queue<E> temp=rear;
		while(temp.next!=null)
			 temp=temp.next;
		
		temp.next=toAdd;
		
	}
	
	//Fn for Delete Elements.
	public E deleteElementFromBeginning() throws Exception
	{
		E item;
		
		if(rear==null)
		{
			 throw new Exception("Queue is Empty");
		}
		
		if(front.next==null)
		{
			item=front.data;
			front=null;
			rear=null;
			return item;
		}
		
		item=front.data;
		front=front.next;
		
		return item;	
	}
	
	
}

public class Q4 {
	
	public static void main(String[] args) throws Exception {
		
		MyQueue<Integer> q=new MyQueue<Integer>();
		
		q.insertElementEnd(10);
		q.insertElementEnd(20);
		q.insertElementEnd(30);
		q.insertElementEnd(40);
		
	

		
		int item=q.deleteElementFromBeginning();
		System.out.println(item);
	}

}
