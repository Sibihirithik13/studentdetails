import java.sql.*;
public class Insertstudent {
public void studentinsert()throws Exception {
	String url ="jdbc:mysql://127.0.0.1:3306/std";
			String username="root";
			String password ="5522";
			String Query= "insert into car values(?,?,?)";
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pst = con .prepareStatement(Query);		
			pst.setInt(1, 102);
			pst.setString(2, "sibi");
			pst.setString(3,"sibi.k@gmail.com");
			pst.executeUpdate();
			con.close();
}
public static void main(String []args) throws Exception{
	Insertstudent ab = new Insertstudent();
	ab.studentinsert();
}
			
			
}

