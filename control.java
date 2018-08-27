package mysql_control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class control {
	Connection conn = null;

    public static void main(String[] args) {
    	control db = new control();
        db.init();
    	//init();
} 
		
	// 初始化
    public  void init() {
        // 不同的数据库有不同的驱动
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql:///test";
        //String url = "jdbc:mysql://localhost:3306/2";127.0.0.1
        	//"jdbc:mysql://127.0.0.1:3306/4";//?useUnicode=true&characterEncoding=UTF-8";
        String user = "圣光";
        String password = "";//yes，我还没设密码，欢迎来黑
      

        try {
            // 加载驱动
            Class.forName(driverName); 
            // 设置 配置数据
            // 1.url(数据看服务器的ip地址 数据库服务端口号 数据库实例)
            // 2.user
            // 3.password  
            conn = DriverManager.getConnection(url, user, password);
            // 开始连接数据库
            System.out.println("数据库连接成功..");
        } catch (ClassNotFoundException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }

    }
	

}
