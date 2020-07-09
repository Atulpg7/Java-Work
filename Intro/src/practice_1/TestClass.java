package practice_1;

import java.util.*;

class TestClass {
    public static void main(String args[] ) {
        
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        
        int flag=1;
        int c=0;
        int sum=0;
        
        	for(int i=2;i<=1000;i++)
        	{
        	for(int j=2;j<=(i/2) ;j++)
        	{
        		if(i%j==0)
        		{
        			flag=0;
        			break;
        		}
        	}
        	
        	if(flag!=0)
        	{
        		//System.out.println(i);
        		sum+=i;
        		c++;
        		
        		if(c==10)
        			break;
        	}
        	
        		flag=1;
        	}
        	
        	System.out.println(sum);
        }
        
        
        
    }

