package org.pack.com;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;



	public class DataDeo {
		static Connection connect;
		static PreparedStatement pst;
		

		public static int insert(String id, String name, String mail,String filename) {
			int status=0;
			try {
				connect=Connector.getConnection();
				pst=connect.prepareStatement("insert into employee values(?,?,?,?)");
				pst.setString(1, id);
				pst.setString(2, name);
				pst.setString(3, mail);
				pst.setString(4,filename);
				status=pst.executeUpdate();
				connect.close();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
			
			return status;	
		}
		public static List<Data> Display() {
			List<Data>list=new ArrayList<Data>();
			try {
				connect=Connector.getConnection();
			pst=connect.prepareStatement("select * from employee");
			ResultSet res=pst.executeQuery();
			while(res.next())
			{
				Data d=new Data();
				d.setId(res.getString(1));
				d.setName(res.getString(2));
				d.setMail(res.getString(3));
				d.setFilename(res.getString(4));
				list.add(d);
			}
			}
			catch (Exception e) {
				System.out.println(e);
			}
			return list;
		}
	
}