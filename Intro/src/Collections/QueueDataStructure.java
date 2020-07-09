package Collections;

import java.util.*;

public class QueueDataStructure {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList<>();
		
		
		for(int i=0;i<10;i++)
			q.add(i);
		
		
		for(int i=10;i>0;i--)
			q.add(i);
		
		
		System.out.println("For Each Loop");
		for(int i: q)
			System.out.print(i+" ");
		
		System.out.println("");
		
		System.out.println("isEmpty Method");
		while(!q.isEmpty())
			System.out.print(q.poll()+" ");
		
		
		//System.out.println("");
		
		/*System.out.println("Simple Loop Method");
		for(int j=0;j<q.size();j++)
			System.out.print(q.remove()+" ");*/
			

	}

}
