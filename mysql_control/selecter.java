package mysql_control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import mysql_control.Initialization;
import mysql_control.controler;

                              	//
								//查询...
								//
public class selecter {
	public ArrayList<controler> getList(){           //单表查询
		ArrayList<controler> cup=new ArrayList<controler>();//存储从数据库中取出来的数据 
        Connection conn=Initialization.init();//获取数据库连接  
        //sql执行器对象  
        PreparedStatement ps=null;  
        //结果集对象  
        ResultSet rs=null;//查询出来的数据先放到rs中  
        try{  
            String sql="select * from try";  
            ps=(PreparedStatement) conn.prepareStatement(sql);  
            rs=ps.executeQuery();//执行数据库查询的方法，放到rs中  
            while(rs.next()){//rs对象相当于一个指针，指向数据库的一横行数据  
            	controler ne =new controler();//封装数据  
                ne.setf1(rs.getInt("f1"));//rs指针指向id一行获取id一行数据，存储到ne中  
                ne.setf2(rs.getInt("f2"));//rs指针指向title一行获取id一行数据，存储到ne中  
                ne.setf3(rs.getInt("f3"));//rs指针指向content一行获取id一行数据，存储到ne中  
                ne.setf4(rs.getInt("f4"));//rs指针指向id一行获取type一行数据，存储到ne中  
                cup.add(ne);//通过循环，把数据的数据依次存储在ne对象中，再把ne对象添加到cup数组中方便提取  
                  
             }  		
         }catch(Exception e){  
             e.printStackTrace();  
         }finally{//重点下面代码必须写，当数据库使用后必须关闭，如果没有关闭数据库的接口有限，下次就不能连接  
             try{  
                 if(rs!=null){  
                     rs.close();  
                 }if(ps!=null){  
                     ps.close();  
                 }if(conn!=null){  
                     conn.close();  
                 }
                 System.out.println("断开链接");
             }catch(Exception e2){  
                 e2.printStackTrace();  
             }
         }
        return cup;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
