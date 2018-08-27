package mysql_control;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class change {
	public static void changer() {
		Connection conn=Initialization.init();
		try {
			String sql = "update try set f2='120',f3='350' where f1='15'";
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("ÐÞ¸Ä³É¹¦...");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
