	package com.dao;
	import com.model.Register;
	import com.controller.*;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
	public class Registerdao {
		private String driver="oracle.jdbc.OracleDriver";
		private String url="jdbc:oracle:thin:@localhost:1521:orcl";
		private String username="hr";
		private String password="hr";
		public Connection MyConnection()
		{
			Connection con = null;
			try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,username,password);
			
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return con;
		}
		public int createData(Register r)
		{
			int i=0;	
			try
			{
				Connection con = MyConnection();
				PreparedStatement ps = con.prepareStatement("Insert into ltidb values(?,?,?,?,?)");
				System.out.println("Connected.."+con);
				ps.setInt(1,r.getRegno());
				ps.setString(2,r.getFname());
				ps.setString(3, r.getUname());
				ps.setString(4,r.getPass());
				ps.setFloat(5, r.getBal());
				i = ps.executeUpdate();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return i;
		}	
	}