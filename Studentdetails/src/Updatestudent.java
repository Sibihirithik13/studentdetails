import java.sql.*;
public class Updatestudent {
	public void studentupdate()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/std";
		String username="root";
		String password ="5522";
		String Query= "update car set name='cibi'where id=101";
		Connection con =DriverManager.getConnection(url,username,password);
		PreparedStatement pst = con .prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args)throws Exception{
		
       Updatestudent ab = new Updatestudent();
       ab.studentupdate();
	}

}
