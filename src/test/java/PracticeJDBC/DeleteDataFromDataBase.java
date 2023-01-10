package PracticeJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DeleteDataFromDataBase {

	public static void main(String[] args) throws SQLException
	{
		Driver dbDriver = new Driver();
		
		DriverManager.registerDriver(dbDriver);
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/wcsa3", "root", "root");
		
		Statement state = connect.createStatement();
		
		// result = state.execute("delete from students where id=101");  check with mam how to delete Data from DB
		
		
		
		

	}

}
