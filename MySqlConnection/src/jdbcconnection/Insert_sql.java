package jdbcconnection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Insert_sql {

	public static void main(String[] args)throws ClassNotFoundException {
		
				try {
					Class.forName("com.mysql.jdbc.Driver");
				 
				   Connection connection  = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "");
				 
				    if (connection != null) {
				        System.out.println("Connected");
				    }
				    
				    String sql = "update employee set EmployeeName= 'Gurman' where idEmployee = 02";
				    Statement statement = (Statement) connection.createStatement();
				    int rows = statement.executeUpdate(sql);
				    if (rows>0)
				    {
				    	
				    	System.out.println("updated successfully");
				    	
				    }
				    
				    else
				    {
				    	System.out.println("failed");
				    	
				    }
				    
				    connection.close();
				   
				    
				    
				} catch (SQLException ex) {
				    System.out.println(ex);
				}
			}

		


	}


