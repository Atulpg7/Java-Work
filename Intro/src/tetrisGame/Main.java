package tetrisGame;

import java.util.*;

public class Main {

	
	//Variables of Rows and Cols
	private static int ROW = 15, COL = 10;
	//Board of the Game
	static char[][] board = new char[ROW][COL];

	
	// Arrays for Storing Shapes points
	static ArrayList<Integer> row = new ArrayList<>();
	static ArrayList<Integer> col = new ArrayList<>();

	
	//Arrays for storing all previous shapes.
	static ArrayList<Integer> rowMain = new ArrayList<>();
	static ArrayList<Integer> colMain = new ArrayList<>();

	
	//Arrays for storing comparing points of shapes to check any shape is 
	//below them or not
	static ArrayList<Integer> checkRow = new ArrayList<>();
	static ArrayList<Integer> checkCol = new ArrayList<>();

	
	//Scanning values variable
	static Scanner sc = new Scanner(System.in);

	
	//Variables for min col, max col and Max Row for checking out of bound exceptions
	static int colMin;
	static int colMax;
	static int rowLimit;
	
	
	//Variable for Points
	static int Points=0;
	
	
	
	
//Fn for print the board	
	public static void printBoard() {
		for (int i = 0; i < 3; i++) {
			System.out.printf(" ");
			for (int j = 0; j < COL; j++)
				System.out.print(board[i][j] + " ");
			System.out.println("");
		}

		for (int i = 3; i < ROW; i++) {
			System.out.printf("|");
			for (int j = 0; j < COL; j++)
				System.out.print(board[i][j] + " ");
			System.out.print("|");
			System.out.println("");
		}

	}

	
	
	
//Fn to Initialize Board
	public static void initArray() {
		for (int i = 0; i < ROW; i++)
			for (int j = 0; j < COL; j++)
				board[i][j] = ' ';

		/*
		 * for(int i=0;i<COL;i++) board[4][i]='x';
		 */
	}

	
	
	
// Fn for getting characters for shape creation
	public static char getChar() {
		String abc = "ltrsrs";
		Random random = new Random();
		return abc.charAt(random.nextInt(abc.length()));
	}

	
	
	
//Fn to Clear shape on board
	public static void clearShape(ArrayList<Integer> row, ArrayList<Integer> col) {
		for (int i = 0; i < row.size(); i++) {
			board[row.get(i)][col.get(i)] = ' ';
		}
	}

	
	
	
//Fn to print shape on board
	public static void printShape(ArrayList<Integer> row, ArrayList<Integer> col) {
		for (int i = 0; i < row.size(); i++) {
			board[row.get(i)][col.get(i)] = 'x';
		}
	}

	

	
	
//Traversing Fn for Top Row
	private static boolean traverse() {
		int count = 0;
		for (int i = 0; i < COL; i++)
			if (board[3][i] == 'x')
				count++;

		if (count != 0)
		{
			System.out.println("\nYou Hit the Top Opps !!!!!");
			return true;
		}

		return false;
	}

	
	
	
	
//Getting Shape on the board
	public static boolean getShapes() {

		checkLine();

		row.clear();
		col.clear();
		checkRow.clear();
		checkCol.clear();

		if (traverse()) {
			return false;
		}

		char c = getChar();

		if (c == 'l') {
			row.add(0);
			row.add(0);
			row.add(1);
			row.add(2);

			col.add(4);
			col.add(5);
			col.add(4);
			col.add(4);

			checkRow.add(0);
			checkRow.add(2);

			checkCol.add(5);
			checkCol.add(4);

		} else if (c == 't') {
			row.add(0);
			row.add(0);
			row.add(0);
			row.add(1);
			row.add(2);

			col.add(3);
			col.add(4);
			col.add(5);
			col.add(4);
			col.add(4);

			checkRow.add(0);
			checkRow.add(0);
			checkRow.add(2);

			checkCol.add(3);
			checkCol.add(5);
			checkCol.add(4);

		} else if (c == 's') {

			row.add(0);
			row.add(0);
			row.add(1);
			row.add(1);

			col.add(4);
			col.add(5);
			col.add(4);
			col.add(5);

			checkRow.add(1);
			checkRow.add(1);

			checkCol.add(4);
			checkCol.add(5);

		} else if (c == 'r') {

			row.add(0);
			row.add(0);
			row.add(0);
			row.add(0);

			col.add(3);
			col.add(4);
			col.add(5);
			col.add(6);

			checkRow.add(0);
			checkRow.add(0);
			checkRow.add(0);
			checkRow.add(0);

			checkCol.add(3);
			checkCol.add(4);
			checkCol.add(5);
			checkCol.add(6);

		}

		printShape(row, col);

		return true;
	}

	
	
	
	
//Fn to check old Shape
	public static boolean checkShape() {

		for (int i = 0; i < checkRow.size(); i++)
			if (board[checkRow.get(i) + 1][checkCol.get(i)] == 'x')
				return true;

		return false;
	}

	
	
	
//Fn to Print old Shapes
	public static void printOldShapes() {

		for (int i = 0; i < row.size(); i++) {
			rowMain.add(row.get(i));
			colMain.add(col.get(i));
		}

		printShape(rowMain, colMain);
	}

	
	
	
//Fn to check horizontal line
	public static void checkLine() {
		int count = 0;
		
		int c2=0;
		boolean a = true;
		
		while (a)
		{
			for (int i = ROW - 1; i > 2; i--) {
				count = 0;
				for (int j = 0; j < COL; j++) {
					if (board[i][j] == 'x')
						count++;
				}
				
				if (count == 10) {
					
					Points++;
					
					ArrayList<Integer> tempRow = new ArrayList<>();
					ArrayList<Integer> tempCol = new ArrayList<>();

					for (int k = 0; k < rowMain.size(); k++) {
						int r = rowMain.get(k);

						if (r != i) {
							tempRow.add(r);
							tempCol.add(colMain.get(k));
						}
					}

					clearShape(rowMain, colMain);

					rowMain.clear();
					colMain.clear();

					for (int l = 0; l < tempRow.size(); l++) {
						
						if(tempRow.get(l) < i)
						{
						rowMain.add(tempRow.get(l) + 1);
						colMain.add(tempCol.get(l));
						}
						else
						{
							rowMain.add(tempRow.get(l));
							colMain.add(tempCol.get(l));
						}
					}

					printShape(rowMain, colMain);

				}
			}
			
			c2++;
			
			if(c2==10)
				break;
		}

		System.out.println("\n");
	}

	
	
	
//Fn to move Shape
	public static boolean moveShape(char ch) {

		clearShape(row, col);

		boolean a = true;

		
		//Moving Left
		if (ch == 'a') {
			if (!((colMin - 1) < 0 || rowLimit + 1 == 15)) 
			{
				for (int i = 0; i < col.size(); i++)
					col.set(i, col.get(i) - 1);

				for (int i = 0; i < checkCol.size(); i++)
					checkCol.set(i, checkCol.get(i) - 1);
			}
		}

		
		// Moving Right
		if (ch == 'd') {
			if (!((colMax + 1) == 10 || rowLimit + 1 == 15)) {
				for (int i = 0; i < col.size(); i++)
					col.set(i, col.get(i) + 1);

				for (int i = 0; i < checkCol.size(); i++)
					checkCol.set(i, checkCol.get(i) + 1);
			}

		}

		
		// Moving Down and automatically down of Shape.
		if (ch == 's' || ch == 'a' || ch == 'd') {
			a = moveDown();
		}

		
		// Pausing the Game
		if (ch == 'p') {
			System.out.println("\n\n====== Game Paused =======\n");
			System.out.print("Enter r for Resume: ");
			char c;
			while ((c = sc.nextLine().charAt(0)) != 'r') {
				System.out.print("Enter r for resume: ");
				System.out.println("");
			}
		}

		printShape(row, col);

		return a;
	}

	
	

//Fn to move down the Shape
	private static boolean moveDown() {

		boolean a = true;

		if (rowLimit + 1 == 15 || checkShape()) {
			printOldShapes();
			a = getShapes();
		}

		else {
			for (int i = 0; i < row.size(); i++)
				row.set(i, row.get(i) + 1);

			for (int i = 0; i < checkRow.size(); i++)
				checkRow.set(i, checkRow.get(i) + 1);
		}
		return a;
	}

	
	
		
//Fn to get Max of Row and cols
	public static int getMax(ArrayList<Integer> list) {

		int max = list.get(0);
		for (int i : list)
			if (i > max)
				max = i;
		return max;
	}

	
	
		
//Fn to get Min of Row and cols
	public static int getMin(ArrayList<Integer> list) {
		int min = list.get(0);

		for (int i : list)
			if (i < min)
				min = i;

		return min;
	}

	
	
	
		
//Main function
	public static void main(String[] args) throws InterruptedException {

		initArray();

		boolean a = true;
		a = getShapes();

		try {
			while (a) {

				printBoard();
				
				rowLimit = getMax(row);
				colMin = getMin(checkCol);
				colMax = getMax(checkCol);


				System.out.print("\n\n A -> Left   S -> One Down \n D -> Right  P -> Pause \n Q -> Quit\n Enter Your Choice: ");
				char ch = sc.nextLine().charAt(0);
				
				if(ch=='q')
					break;
				a = moveShape(ch);

			}
		} catch (Exception e) {
			System.out.println("" + e);
		}

		System.out.println("\n\nYour Points: "+Points);
		System.out.println("Game is over !!!!!");

	}

}
