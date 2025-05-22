package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;


public class UserModel {
	
	private ArrayList<User> users = new ArrayList<User>();

    
    public UserModel() {
    	
    }

    public ArrayList<User> get() {
        String sql = "SELECT id, name, email, role, phone, create_at FROM users";
        Connection conn = null;
		Statement stmt = null;
		
        try 
           {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	try {
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/test", "root", "");
				stmt = conn.createStatement();
				
				ResultSet rs = stmt.executeQuery(sql);
	            while (rs.next()) { 
	            	users.add(new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
	                    rs.getString("role"), rs.getString("phone"), rs.getDate("create_at")
	                ));
	            }
	            rs.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
           } catch (ClassNotFoundException e) {
        	   e.printStackTrace();
           }
        
        return users;
    }
    public boolean add(String name, String email, String role)
	{
		String query = "INSERT INTO `users` (`id`, `name`, `email`, `role`, `phone`, `create_at`, `update_at`) VALUES (NULL, '"+name+"', '"+email+"', '"+role+"', NULL, NULL, NULL);";
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/test", "root", "");
			stmt = conn.createStatement();
			
			int rs = stmt.executeUpdate(query);
			 
			if(rs > 0) 
				return true; 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		return false;
	}
}

