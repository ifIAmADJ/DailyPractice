package mysql_control;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
import java.util.ArrayList;

//Connection conn=Initialization.init();     ��������

	public class Initialization {
		
		static Connection conn = null;

	    public static void main(String[] args) {
	    	//Initialization db = new Initialization();
	         //db.init();
	    	//init();
	         
	         ArrayList<controler> cup= new selecter().getList();  
	          for(controler ne:cup){  
	              System.out.println(ne.getf1()+" "+ne.getf2());  
	         }  
	          
	          //increase.increaser();          	//�������Ӽ�¼��������ҪϹ�á�
	     
	          //change.changer();				//�ı��¼��Ҫע��ʹ��where.
	          
	          //delete.deleter();				//ɾ����¼��Ҫע��ʹ��where��
	} 
			
		// ��ʼ��
	    public static Connection init() {
	        // ��ͬ�����ݿ��в�ͬ������
	        String driverName = "com.mysql.jdbc.Driver";
	        String url = "jdbc:mysql:///test";
	        //String url = "jdbc:mysql://localhost:3306/2";127.0.0.1
	        	//"jdbc:mysql://127.0.0.1:3306/4";//?useUnicode=true&characterEncoding=UTF-8";
	        String user = "ʥ��";
	        String password = "";//yes���һ�û�����룬��ӭ����
	      

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
	        return conn;

	    }
		

	}



