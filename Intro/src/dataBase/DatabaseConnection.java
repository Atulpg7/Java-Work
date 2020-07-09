package dataBase;

import java.sql.*;

public class DatabaseConnection {
	
	private final String DB_URL;
	private final String USER ;
	private final String PASS ;
	
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	
	DatabaseConnection(String db,String user,String pass){
		this.DB_URL=db;
		this.USER=user;
		this.PASS=pass;
	}
	
	
	
	public void getConnection()
	{
		//System.out.println("Connecting to Database.....");
		
		try { 
			
		con=DriverManager.getConnection(DB_URL,USER,PASS);
		System.out.println("Connection Done....");
		con.setAutoCommit(false);
		
		stmt=con.createStatement();
		
		String query="select * from Test";
		//Statement stmt = con.createStatement();
		System.out.println(stmt.execute(query));
		
		
		String truncate="TRUNCATE Test";
		
		stmt.executeUpdate(truncate);
			
	   String SQL = "INSERT INTO Test  " +
	                "VALUES (1,'Rita')";
	  
	   stmt.executeUpdate(SQL);  
	   
	   //Submit a malformed SQL statement that breaks
	   
	   String SQL2 = "INSERT INTO Test  " +
               "VALUES (2,'Sita')";
	   
	   stmt.executeUpdate(SQL2);
	   
	   // If there is no error.
	   con.commit();
			
			
			
		}catch(Exception e){
			
			System.out.println("Error Main: "+e);
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				System.out.println("Roll back error: "+e);
			}
			
		}
		
		
		getAll("SELECT * FROM Test");
	}
	
	
	
	
	
	
	public void getAll(String query) {
		
		
		try {
			
			rs=stmt.executeQuery(query)
;
			
			while(rs.next())
				System.out.println(rs.getInt(1));
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	

	public void updateQuery(String query) {
		
	  try {
			
//			System.out.println("\nUpdating Value....");
			
			stmt.executeUpdate(query);
			
			//System.out.println("Total row Effected: "+rowEffected);
			
			
		} catch (Exception e) {
			System.out.println("Error in Execute: "+e.getMessage());
		}
		
	}



	
	
	public void closeConnections() {
		
		try {
		
			con.close();
			stmt.close();
			//rs.close();
			
			System.out.println("All connections are now closed....");
		}catch(Exception e){
			System.out.println("Error in closing: "+e);
			}
		
	}


	public void setPrepared() {
		
		try {
			
			PreparedStatement stmt=con.prepareStatement("insert into Test values(?,?)");
			
			int count=0;
			for(int i=11;i<=20;i++)
			{	
				stmt.setInt(1, i);
				stmt.setString(2, "Piyu"+i);
				stmt.executeUpdate();
				count++;
			}
			
			
			System.out.println("Total Rows Effected: "+count);
				
			
		} catch (Exception e) {
			System.out.println("Error in Prepared: "+e.getMessage());
		}
		
		
	}

}
