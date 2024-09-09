import java.sql.*;

public class Getstudent {
	public void studentget()throws Exception{
		String url ="jdbc:mysql://127.0.0.1:3306/std";
		String username="root";
		String password ="5522";
		String Query="select * from car";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement smt=con.createStatement();
		ResultSet rst = smt.executeQuery(Query);
		while(rst.next()) {
			System.out.println("id"+rst.getInt(1));
			System.out.println("name"+rst.getString(2));
			System.out.println("class"+rst.getString(2));	
		}
			con.close();
			
			
		}
		public static void main(String[]args) throws Exception{
			Getstudent ab = new Getstudent();
			ab.studentget();
		}
	}


