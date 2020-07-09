package opps;


class Dogiee
{
	int legs;
}

public class Method2 {
	
	public static void main(String[] args)
	{
		Dogiee c=new Dogiee();
		Dogiee d=new Dogiee();
		c.legs=4;
		d.legs=5;
		
		swap(c,d);
		
		System.out.println(c.legs+" "+d.legs);
	}
	
	static void swap(Dogiee a,Dogiee b)
	{
		int temp=a.legs;
		a.legs=b.legs;
		b.legs=temp;
	}

}
