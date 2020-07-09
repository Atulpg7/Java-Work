package snakeAndladder;
import java.util.*;


//*********** Class for Players **********//
class SandL{
	
	int pos;	
	
	// Constructor to set Player position to -1;
	public SandL()
	{
		this.pos=-1;
	} 
	
}





//*********************Main Class *************//
public class Main
{

	
//******** Global variables of 3 times 6, move for player turn change and Array ***********//	
	static int thsix=0;
	static int move=0;
    static int[] a=new int[101];
    
    
    
    
   
//************** Function to Initializing ladders and snakes values ***********************//
    static{
    	a[4]=18;
    	a[10]=19;
    	a[14]=63;
    	a[40]=-20;
    	a[50]=-43;
    	a[74]=14;
    	a[81]=-3;
    	a[95]=-59;
    	a[99]=-98;
    	}
    
    

    
    
//********************* Function for Random nums from 1-6 Function. ***********************//
    public static int getNum() {
    Random rand=new Random();
    int randomNum = rand.nextInt(6) + 1;
   
    return randomNum;
}

    
    
        
//*********** Function for checking any ladder, snake and player in array ****************//    
public static void check(SandL player,String pl)
    {
    	int t=a[player.pos];
    	
    	if(t==1)
    	{
    		System.out.println("Oh!!! Player "+pl+" eaten player 1");
    		player.pos=-1;
    	}
    	else if(t==2)
    	{
    		System.out.println("Oh!!! Player "+pl+" eaten player 2");
    		player.pos=-1;
    	}
    	
    	
    	if(t!=0 && t!=1 && t!=2) 
    	{
    		if(t<0)
    		{
    			System.out.println("Oh you are eaten by snake !!!");
    			player.pos=t+player.pos;
    		}
    		else
    		{
    			System.out.println("Oh you got ladder....");
    			player.pos=t+player.pos;
    		}
    	}
    }
    




//***************** Function for Moving Players **************//
    public static boolean move(SandL player,String pl)
    {
    	while(true)
    	{
    		int m=getNum();
    		int move=m;
    		System.out.println("P"+pl+" got: "+m);
    		
    	
    	if(((player.pos)+move)<=100)
		{ 
		
    		if((player.pos)==-1 && move==6)
    		{
    			player.pos++;
    		}
    	
    		else if(player.pos!=-1)
    		{
        		
        		while(m==6)
        		{
        			thsix++;
        			if(thsix==3)
        			{
        			System.out.println("Oops you got three sixes !!!!");
        			System.out.println("Player "+pl+" is at: "+player.pos);
        			thsix=0;
        			return false;
        			}
    	    		else
    	    		{
    	    			m=getNum();
    	    			System.out.println("P"+pl+" now got: "+m);
    	    			move+=m;
    	    		}
        		}
    			
    		int t=player.pos;
    		a[t]=0;
    		
    		player.pos=player.pos+move;
    		
    		check(player,pl);
    		a[player.pos]=Integer.parseInt(pl);
    		System.out.println("Player "+pl+" is at: "+player.pos);
    		break;
    		
    		}
    	else
    	{
    		System.out.println("You Missed it....");
    		break;
    	}
    		
		}
		else
		{
			System.out.println("Try Again.......");
			break;
		}
    }
    	
    	return false;
    	
    }
    
    
    
    
//***************** Main Function *********************//    
	public static void main(String[] args) throws InterruptedException {
	    
		Scanner sc=new Scanner(System.in);
		SandL p1=new SandL();
		SandL p2=new SandL();
		
		boolean f=false; 
	    
		while(!f)
	    {
				Thread.sleep(1000);
			
	        if(move%2==0)
	        {

	            System.out.println("Player 1 Turn");
	            f=move(p1,"1");
	    		
	            if(p1.pos==100)
	    		{
	    			System.out.println("Player 1 Winner.....");
	    			break;
	    		}
	            
	            move++;
	        }
	        else 
	        {

	            System.out.println("Player 2 Turn");
	            f=move(p2,"2");
	    		
	            if(p2.pos==100)
	    		{
	    			System.out.println("Player 2 Winner.....");
	    			break;
	    		}
	            move++;
	        }
	        
	        System.out.println("");
	    
	    }
	    sc.close();
	}
}
