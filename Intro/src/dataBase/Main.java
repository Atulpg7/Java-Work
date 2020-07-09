package dataBase;

public class Main {
	
	public static void main(String[] args) {
		
		 final String DB_URL ="jdbc:mysql://localhost:8889/Java";
		 final String USER = "root";
		 final String PASS = "root";
		
		 DatabaseConnection dc=new DatabaseConnection(DB_URL,USER,PASS);
		 
		 dc.getConnection();
		 
		 
		 /*dc.updateQuery("TRUNCATE Test");
		 for(int i=1;i<=10;i++)
			 dc.updateQuery("insert into Test values("+i+",'"+i+" Atul')");
		 dc.getAll("select * from Test");
		 
		 
		 
		 
		 //Prepared
		 
		 System.out.println("\nUsing Prepared Method\n");
		 dc.setPrepared();
		 dc.getAll("select * from Test");
		 
		 */
		 dc.closeConnections();
		 

	}

}
