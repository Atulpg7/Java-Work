//package snakeGame;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


//*************** Class Board for Game Board, Fruits, Print Board ********************//
class Board
{
	static Scanner sc=new Scanner(System.in);
    static int M_R=10,M_C=10,fruit_qty=5;
	static char board[][]=new char[M_R][M_C];
	
	static ArrayList<Integer> bro=new ArrayList();
	static ArrayList<Integer> bcol=new ArrayList();
	
	
//************ Construtor Call the initBoard to initialize it ************************//
	public Board()
	{
		boardInit();
	}
	
	
	
	
//********************* Fn for initialize board with Walls ***************************//
	public void boardInit()
	{
		//board[0][3]='w';
		//board[0][7]='w';
		board[1][0]='w';
		//board[1][1]='w';
		//board[1][3]='w';
		board[1][2]='w';
		board[1][6]='w';
		//board[2][0]='w';
		board[2][3]='w';
		//board[2][2]='w';
		board[3][1]='w';
		//board[3][7]='w';
		board[3][8]='w';
		board[3][9]='w';
		board[4][0]='w';
		//board[4][2]='w';
		board[4][6]='w';
		board[5][3]='w';
		board[5][4]='w';
		//board[5][5]='w';
		board[6][0]='w';
		//board[6][4]='w';
		board[7][4]='w';
		//board[7][7]='w';
		board[7][8]='w';
		board[8][0]='w';
		//board[8][3]='w';
		board[8][6]='w';
		board[9][3]='w';
		board[9][4]='w';
		//board[9][5]='w';
	}
	
	
	
	
//***************************** FN for Print the Board ********************************//
	public void printBoard()
	{
		System.out.println("\n\n");
		
		for(int i=0;i<M_R;i++)
		{
			System.out.print("| ");
			for(int j=0;j<M_C;j++)
				System.out.print(board[i][j]+"\t");
			System.out.print("|");
			System.out.println("");
		}
	}
	
}



//************************************************************************************//






//****************************** Main Class ***********************************//
public class SnakeGame extends Board {
	

//*********************** Variables for Snake Head and Body ***********************//
	static int sr,scol;
	static int fruits_eaten=0;
	static Board b=new Board();
	
	//static int highScore;
	

	
	
/************************** High Score Files Data *****************
	public static void getHighScoreData() throws IOException
	{
        FileReader fr = null;
		try {
			fr = new FileReader("/Users/atulkumar/desktop/Java/intro/src/snakeGame/highscore.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}    
        
		int i;    
        while((i=fr.read())!=-1)  
        {
        highScore=Integer.parseInt(String.valueOf(i));
        }
        
        fr.close();
	}
	*/
	
	

//****************************Function For Eating Fruits****************************//
	 public static boolean eatFruits(int r,int c)
	 {
		 if(board[r][c]=='f')
		 {
			 //System.out.println("Inside Fruits");
			 fruits_eaten++;
			 fruit_qty--; 	
			 fruitOne();
			 return true;
		 }
		 
		 return false;
		 
	 }
	
	
//**********************Function For placing Fruits*********************************//
	 public static void fruits()
	{
		//System.out.print("\nEnter Fruit Quantity: ");
		//int i=sc.nextInt();
		int i=fruit_qty;
		while(i>0)
		{
			int r=getRandom();
			int c=getRandom();
			
			if(board[r][c]!='w' && board[r][c]!='f' && board[r][c]!='O' && board[r][c]!='x')
			{
				i--;
				board[r][c]='f';
			}
		
		}
	}
	
	 
	 
	 
	 
//************** Function For placing 1 Fruit after eating ************************//
		 public static void fruitOne()
		{
			int i=1;
			while(i>0)
			{
				int r=getRandom();
				int c=getRandom();
				
				if(board[r][c]!='w' && board[r][c]!='f' && board[r][c]!='x')
				{
					i--;
					board[r][c]='f';
				}
			
			}
		}
	 
	 
	 
	 	 


// ***************************** Function For Ploting Snake ***********************//
	 public static void plotSnake(int sr,int sc,int br,int bc)
	 {
		 board[sr][sc]='O';
		 board[br][bc]='x';
	 }
	 

	 
	 
	 
// ***************************** Function For Initialize Snake ***********************//
	public  static void snakeBody()
	{
		//int count=0;
		while(true)
		{
		
			int r=getRandom();
			int c=getRandom();
			
			if(board[r][c]!='w' && board[r][c]!='f')
			{
				if((r>1 && c>1) && (r<M_R-1 && c<M_C-1))
				{
					int c1=r-1;
					int c2=r+1;
					int c3=c-1;
					int c4=c+1;
					
					
					char a1=board[c1][c];
					char a2=board[c2][c];
					char a3=board[r][c3];
					char a4=board[r][c4];
					
					
					if(a1=='\0')
					{
						sr=r;
						scol=c;
						
						bro.add(c1);
						bcol.add(c);
						
						
						plotSnake(sr, scol, bro.get(0), bcol.get(0));
						
						break;
						
					}
					
					else if(a2=='\0')
					{
						sr=r;
						scol=c;
						
						bro.add(c2);
						bcol.add(c);
						
						plotSnake(sr, scol, bro.get(0), bcol.get(0));
						
						break;
					}
					else if(a3=='\0')
					{
						sr=r;
						scol=c;
						
						bro.add(c3);
						bcol.add(c);
						
						
						plotSnake(sr, scol, bro.get(0), bcol.get(0));
						
						break;
					}
					else if(a4=='\0')
					{
						sr=r;
						scol=c;
						
						bro.add(c4);
						bcol.add(c);
						
						
						plotSnake(sr, scol, bro.get(0), bcol.get(0));
						
						break;
					}
					
					
				}
			}
		}
	}
	
//********************************* Clear Screen Function ****************************//	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
	
	
	
	
	
	
//*************************** Fn for Random numbers ************************************//
	public static int getRandom()
	{
		Random random=new Random();
	    int randomNum = random.nextInt(9) + 1;
	    return randomNum;
		
	}
	
	


	
//************** Function For Scanning Direction for Moving Snake ***********************//
	public static void move()
	{
		int i=1;
		while(i==1)
		{
				//clearScreen();
				b.printBoard();
				System.out.print("\nEnter (A,S,D or W): ");
				char mv=sc.nextLine().charAt(0);
				i=makeMove(mv);
			
		}
	}
	
	
	
	
	
//****************** Function For make Move & check it is Possible or Not ****************//
	public static int makeMove(char m)
	{
		int srow=sr,scl=scol;
		int brow=bro.get(0),bcl=bcol.get(0);
		

		
		
		
//**************Important Checks***********************//
		
		if(m=='w')
		{
			if(scl==bcl && srow>brow)
			{
				b.printBoard();
				return 1;
			}
		}
		
		if(m=='d')
		{
			if(srow==brow && scl<bcl)
			{
				b.printBoard();
				return 1;
			}
		}
		if(m=='a')
		{
			if(srow==brow && scl>bcl)
			{
				b.printBoard();
				return 1;
			}
		}
		if(m=='s')
		{
			if(scl==bcl && srow<brow)
			{
				b.printBoard();
				return 1;
			}
		}
		
//*******************************************************//
		
		

		
		


		
		
//******************* W Moves ***************************//
		
			if(m=='w')
			{
				if(srow>0)
				{
					if( ((scl==bcl && srow<brow ) || (scl<bcl) || (scl>bcl))  && (board[srow-1][scol]!='w' && board[srow-1][scol]!='x'))
					{
						boolean a=eatFruits(srow-1,scol);
						if(a)
						{
							int lr=bro.get(bro.size()-1);
							int lc=bcol.get(bcol.size()-1);
							board[lr][lc]='\0';
							
							bro.add(0,srow);
							bcol.add(0,scl);
							
							for(int i=0;i<bro.size();i++)
							{
								int r=bro.get(i);
								int c=bcol.get(i);
								board[r][c]='x';
								
							}
							sr-=1;
							board[sr][scol]='O';
							b.printBoard();
							return 1;
						}
						else
						{
							int lr=bro.get(bro.size()-1);
							int lc=bcol.get(bcol.size()-1);
							board[lr][lc]='\0';
							

							
							bro.add(0,srow);
							bcol.add(0,scl);
							
							bro.remove(bro.size()-1);
							bcol.remove(bcol.size()-1);
							
							sr-=1;
							
							board[sr][scol]='O';
							
							for(int i=0;i<bro.size();i++)
							{
								int r=bro.get(i);
								int c=bcol.get(i);
								
								board[r][c]='x';
							}
							
							b.printBoard();
							return 1;
						}
						
					}
					else
					{
						System.out.println("You are Out");
						return 0;
					}
					
				}
				else
				{
					System.out.println("You are out");
					return 0;
				}
			}

//*******************************************************//
			
			
			
			
			

			
			
			
//******************* S Moves ****************************//
			
			if(m=='s')
			{
				if(srow<M_R-1)
				{
					if(((scl==bcl && srow>brow) || (scl<bcl) || (scl>bcl)) && (board[srow+1][scol]!='w' && board[srow+1][scol]!='x'))
					{
						boolean a=eatFruits(srow+1,scol);
						if(a)
						{
							
							int lr=bro.get(bro.size()-1);
							int lc=bcol.get(bcol.size()-1);
							board[lr][lc]='\0';
							
							bro.add(0,srow);
							bcol.add(0,scl);
							
							for(int i=0;i<bro.size();i++)
							{
								int r=bro.get(i);
								int c=bcol.get(i);
								board[r][c]='x';
								
							}
							sr+=1;
							board[sr][scol]='O';
							b.printBoard();
							return 1;
	
						}
						else {	
							
							int lr=bro.get(bro.size()-1);
							int lc=bcol.get(bcol.size()-1);
							board[lr][lc]='\0';
							

							
							bro.add(0,srow);
							bcol.add(0,scl);
							
							bro.remove(bro.size()-1);
							bcol.remove(bcol.size()-1);
							
							sr+=1;
							
							board[sr][scol]='O';
							
							for(int i=0;i<bro.size();i++)
							{
								int r=bro.get(i);
								int c=bcol.get(i);
								
								board[r][c]='x';
							}
							
							b.printBoard();
							return 1;
						}
					}
					else
					{
							System.out.println("You are Out");
							return 0;
					}
				}
				else
				{
						System.out.println("You are Out");
						return 0;
				}
			}
			
//*******************************************************//			
			

			
			
			
			
			
			
			
//******************* D Moves ****************************//
			
			if(m=='d')
			{
				if(scol<M_C-1)
				{
					if(board[srow][scol+1]!='w' && board[srow][scol+1]!='x')
					{
						boolean a=eatFruits(srow,scol+1);						
						
						if(a)
						{
							
							int lr=bro.get(bro.size()-1);
							int lc=bcol.get(bcol.size()-1);
							board[lr][lc]='\0';
							
							bro.add(0,srow);
							bcol.add(0,scl);
							
							for(int i=0;i<bro.size();i++)
							{
								int r=bro.get(i);
								int c=bcol.get(i);
								board[r][c]='x';
								
							}
							scol+=1;
							board[sr][scol]='O';
							b.printBoard();
							return 1;
							
							
	
						}
						else {	
							
							//System.out.println("Else True");
							
							int lr=bro.get(bro.size()-1);
							int lc=bcol.get(bcol.size()-1);
							board[lr][lc]='\0';
							
							bro.add(0,srow);
							bcol.add(0,scl);
							
							bro.remove(bro.size()-1);
							bcol.remove(bcol.size()-1);
							
							scol+=1;
							
							board[sr][scol]='O';
							
							for(int i=0;i<bro.size();i++)
							{
								int r=bro.get(i);
								int c=bcol.get(i);
								
								board[r][c]='x';
							}
							
							b.printBoard();
							return 1;
						}
					}
					else
					{
						System.out.println("You are Out");
						return 0;
					}
			}else
			{
				System.out.println("You Are Out");
				return 0;
			}
				
			}
//*******************************************************//
			

	
			
			
			
			
			
//******************* A Moves ***************************//
			
			if(m=='a')
			{
				if(scol>0)
				{
					if(board[srow][scol-1]!='w' && board[srow][scol-1]!='x')
					{
						boolean a=eatFruits(srow,scol-1);
						if(a)
						{
							
							int lr=bro.get(bro.size()-1);
							int lc=bcol.get(bcol.size()-1);
							board[lr][lc]='\0';
							
							bro.add(0,srow);
							bcol.add(0,scl);
							
							for(int i=0;i<bro.size();i++)
							{
								int r=bro.get(i);
								int c=bcol.get(i);
								board[r][c]='x';
								
							}
							scol-=1;
							board[sr][scol]='O';
							b.printBoard();
							return 1;
							
							
	
						}
						else {	
							
							int lr=bro.get(bro.size()-1);
							int lc=bcol.get(bcol.size()-1);
							board[lr][lc]='\0';
							
							bro.add(0,srow);
							bcol.add(0,scl);
							
							bro.remove(bro.size()-1);
							bcol.remove(bcol.size()-1);
							
							scol-=1;
							
							board[sr][scol]='O';
							
							for(int i=0;i<bro.size();i++)
							{
								int r=bro.get(i);
								int c=bcol.get(i);
								
								board[r][c]='x';
							}
							
							b.printBoard();
							return 1;
						}
					}
					else
					{
						System.out.println("You are Out");
						return 0;
					}
				}
				else
				{
					System.out.println("You Are Out");
					return 0;
				}
				
			}
			
			return 0;
			
			
			
}
	
//*************************************************************//
	
	
	
	
	
	
	
	
//******************** Main Function ************************//
	
	public static void main(String[] args) throws IOException
	{

		
		//getHighScoreData();
		fruits();
		snakeBody();
		b.printBoard();
		move();
		
		System.out.println("\n\n*******************************\n");
		System.out.println("\tYou Eated "+fruits_eaten+" Fruits");
		System.out.println("\n*******************************");
		
		//System.out.println("F: "+fruits_eaten+" H: "+highScore);
		
		
		/*if(fruits_eaten>highScore)
		{
			 try{    
		           FileWriter fw=new FileWriter("/Users/atulkumar/desktop/Java/intro/src/snakeGame/highscore.txt");    
		           fw.write(fruits_eaten);    
		           fw.close();    
		          }
			 catch(Exception e)
			 {
		        	  System.out.println(e);
		     }    
		          System.out.println("New High Score: "+fruits_eaten);    
		 }*/
		
		}
		
	}
//**********************************************************//
	
