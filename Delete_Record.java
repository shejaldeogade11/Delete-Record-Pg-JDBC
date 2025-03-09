
package JAVA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delete_Record {
	  public static void main(String[] args) {
		  Connection con;
	        PreparedStatement pstmt;

	        try {
	            String url = "jdbc:postgresql://localhost:5432/menucard";
	            String user = "postgres";
	            String pwd = "shejal@123";
	            con = DriverManager.getConnection(url, user, pwd);
	            System.out.println("Connection Ok");

	            pstmt = con.prepareStatement("delete from menu where mid=4" );
               int r= pstmt.executeUpdate();
               System.out.println(r);
               if(r>0) {
            	   System.out.println("Success delete");
               }else {
            	   System.out.println("fail");
               }
               
	           

	          
	        } catch (Exception e) {
	        	  System.out.println(e);
	        }
	    }

	private static PreparedStatement executeUpdate() {
		// TODO Auto-generated method stub
		return null;
	}
}


