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
		
	// ��ʼ��
    public  void init() {
        // ��ͬ�����ݿ��в�ͬ������
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql:///test";
        //String url = "jdbc:mysql://localhost:3306/2";127.0.0.1
        	//"jdbc:mysql://127.0.0.1:3306/4";//?useUnicode=true&characterEncoding=UTF-8";
        String user = "ʥ��";
        String password = "";
      

        try {
            // ��������
            Class.forName(driverName); 
            // ���� ��������
            // 1.url(���ݿ���������ip��ַ ���ݿ����˿ں� ���ݿ�ʵ��)
            // 2.user
            // 3.password  
            conn = DriverManager.getConnection(url, user, password);
            // ��ʼ�������ݿ�
            System.out.println("���ݿ����ӳɹ�..");
        } catch (ClassNotFoundException e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }

    }
	

}
