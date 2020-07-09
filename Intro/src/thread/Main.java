package thread;

import java.util.ArrayList;

class Data<R,N>{
	
	R roll;
	N name;
	
	Data(R r,N n)
	{
		roll=r;
		name=n;
	}
	
	
	
}


public class Main{
	
	
	static void getArray(ArrayList<Data> list)
	{
		for(int i=0;i<3;i++)
		{
			list.add(new Data(i,"Atul "+i));
		}
		
		
		for(float i=0.0f;i<3.0f;i++)
		{
			list.add(new Data(i,"Aman"+i));
		}
		
		for(int i=0;i<3;i++)
		{
			list.add(new Data(i,i+1));
		}
	}
	
	static void printArray(ArrayList<Data> list)
	{
		for(int i=0;i<list.size();i++)
		{
			Data d=list.get(i);
			System.out.println("Roll: "+d.roll+" Name: "+d.name);
		}
	}
	
	
	public static void main(String[] args){
		
		ArrayList<String> list=new ArrayList();
		
		
		list.add("Hii");
		list.remove("hii");
		System.out.println(list);
		//getArray(list);
//		printArray(list);
		
		
		
		
		
		
	}

}
