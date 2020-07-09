package Collections;

import java.util.LinkedList;
import java.util.Queue;


class CustomQueue<E>{
	
	private Node<E> head;
	private Node<E> rear;
	
	class Node<E>{
		E data;
		Node<E> next;
		
		Node(E data)
		{
			this.data=data;
			next=null;
		}
	}
	
	
	public void enqueue(E e)
	{
		Node<E> toAdd=new Node<E>(e);
		
		if(head == null)
		{
			head=rear=toAdd;
			return;
		}
		
		
		rear.next=toAdd;
		rear=rear.next;
		
	}
	
	
	public E dequeue()
	{
		if(head==null)
		{
			head=rear=null;
			return null;
		}
		Node<E> temp=head;
		
		head=head.next;
		
		return temp.data;
	}
	
}


public class QueueDs {
	
	public static void main(String[] args) {
		
		
		CustomQueue<Integer> q=new CustomQueue<>();
		
		
		q.enqueue(10);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(10);
		
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		
		
	}
	
}
