package beans;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Test {
	private String driver;
	private String url;
	private String user;
	private String password;
	
	
	public void setDriver(String driver) {
		this.driver = driver;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void printConn() throws Exception
	{
		
		Class.forName(driver);
		java.sql.Connection con=DriverManager.getConnection(url, user, password);
		System.out.println(con);
	}
	

}
