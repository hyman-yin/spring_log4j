package spring_log4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB {
	private static final String driver_name="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/log4j?serverTimezone=UTC";
	private static final String username="root";
	private static final String password="qwer1234";
	
	public static void main(String[] args) {
		try {
			Class.forName(driver_name) ;   
		     Connection con = DriverManager.getConnection(url , username , password ) ;   
		     Statement stmt = con.createStatement();
		     String sq1="select * from spring_log";
		     ResultSet rs = stmt.executeQuery(sq1);
			while(rs.next()){
				System.out.println("111");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
