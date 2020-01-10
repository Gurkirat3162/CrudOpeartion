package jdbcconnection;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Mysql_Connection {

	public static void main(String[] args) {

			try{  
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/test","root","");  
			//Select data from table
			
			if (con !=null)
			{
				
				System.out.println("Connection successfully connected");
				
			}
			java.sql.Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from test.employee");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}
		catch(Exception e){
				
				System.out.println(e);
			
			}  
		
					

	}



 
 
 



	}


