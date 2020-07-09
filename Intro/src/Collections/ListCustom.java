package Collections;

import java.util.LinkedList;
import java.util.List;

class CustomList<E>{
	
	private Node<E> head;
	
	private long size=0;

	
	
	// Node class
	class Node<E>{
		E data;
		Node<E> next;
		
		Node(E data)
		{
			this.data=data;
			next=null;
		}
	}
	
	
	
	// Check Fn
	private boolean isEmpty() {
		return head == null;
	}

	
	
	//Add Fn
	public void add(E data)
	{
		Node<E> newNode=new Node<>(data);
		
		
		if(isEmpty())
		{
			head=newNode;
			size++;
			return;
		}
		
		Node<E> temp=head;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=newNode;
		size++;
		
	}
	
	
	
	//Fn Print
	public void print()
	{
		Node<E> temp=head;
			
		System.out.print("List : [ ");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		System.out.println("]");
	}
	
	
	
	//Fn Contains
	public boolean contains(E item)
	{
		
		Node<E> temp=head;
		while(temp.data!=item && temp.next!=null)
		{
			temp=temp.next;
		}
		
		return temp.data==item;
	}

	
	
	//Fn getIndex
	public int getIndex(E item)
	{
		int index=0;
		
		Node<E> temp=head;
		
		while(temp.data!=item && temp.next!=null)
		{
			++index;
			temp=temp.next;
		}
		
		
		
		return temp.data==item?index:-1;
	}
	
	
	
	
}


public class ListCustom {


	public static void main(String[] args) {
		
		
		CustomList<Integer> list=new CustomList<>();
		
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		
		
		list.print();
		System.out.println("Contains: "+list.contains(10));
		System.out.println("Get Index: "+ list.getIndex(10));
		
		
		
		List<Integer> list2=new LinkedList<>();
		
		list2.contains(1);
		
		
		
		
	
	}	
}