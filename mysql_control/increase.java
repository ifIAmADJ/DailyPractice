package mysql_control;

import java.sql.Connection;
import java.sql.SQLException;

import mysql_control.Initialization;

import com.mysql.jdbc.Statement;

												//
												//增加记录...
												//

public class increase {
	public static void increaser()  {
		Connection conn=Initialization.init();
		try {
			String sql ="insert into try (f1,f2,f3,f4) values('555','666','888','999')";
			Statement stmt = (Statement) conn.createStatement();
			stmt.executeUpdate(sql);
			conn.close();
			System.out.println("添加记录成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}	
}
