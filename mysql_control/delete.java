package mysql_control;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class delete {
	public static void deleter() {
		Connection conn=Initialization.init();
		String link="delete from try where f1='12'";
		try {
			String sql=link;
			Statement stmt =(Statement) conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("É¾³ý³É¹¦...");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
