package mysql_control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import mysql_control.Initialization;
import mysql_control.controler;

                              	//
								//��ѯ...
								//
public class selecter {
	public ArrayList<controler> getList(){           //�����ѯ
		ArrayList<controler> cup=new ArrayList<controler>();//�洢�����ݿ���ȡ���������� 
        Connection conn=Initialization.init();//��ȡ���ݿ�����  
        //sqlִ��������  
        PreparedStatement ps=null;  
        //���������  
        ResultSet rs=null;//��ѯ�����������ȷŵ�rs��  
        try{  
            String sql="select * from try";  
            ps=(PreparedStatement) conn.prepareStatement(sql);  
            rs=ps.executeQuery();//ִ�����ݿ��ѯ�ķ������ŵ�rs��  
            while(rs.next()){//rs�����൱��һ��ָ�룬ָ�����ݿ��һ��������  
            	controler ne =new controler();//��װ����  
                ne.setf1(rs.getInt("f1"));//rsָ��ָ��idһ�л�ȡidһ�����ݣ��洢��ne��  
                ne.setf2(rs.getInt("f2"));//rsָ��ָ��titleһ�л�ȡidһ�����ݣ��洢��ne��  
                ne.setf3(rs.getInt("f3"));//rsָ��ָ��contentһ�л�ȡidһ�����ݣ��洢��ne��  
                ne.setf4(rs.getInt("f4"));//rsָ��ָ��idһ�л�ȡtypeһ�����ݣ��洢��ne��  
                cup.add(ne);//ͨ��ѭ���������ݵ��������δ洢��ne�����У��ٰ�ne������ӵ�cup�����з�����ȡ  
                  
             }  		
         }catch(Exception e){  
             e.printStackTrace();  
         }finally{//�ص�����������д�������ݿ�ʹ�ú����رգ����û�йر����ݿ�Ľӿ����ޣ��´ξͲ�������  
             try{  
                 if(rs!=null){  
                     rs.close();  
                 }if(ps!=null){  
                     ps.close();  
                 }if(conn!=null){  
                     conn.close();  
                 }
                 System.out.println("�Ͽ�����");
             }catch(Exception e2){  
                 e2.printStackTrace();  
             }
         }
        return cup;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
