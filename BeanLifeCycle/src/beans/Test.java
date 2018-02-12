package beans;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.mysql.jdbc.*;;

public class Test  implements InitializingBean,DisposableBean{
	private String driver,url,username,pwd;
	private java.sql.Connection con;
	
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		Class.forName(driver);
		con=DriverManager.getConnection(url, username, pwd);
		System.out.println("Connection opened");
		
	}
	public void save(int id,String name, String email, String address) throws Exception{
	PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setString(3, email);
	ps.setString(4, address);
	ps.executeUpdate();
	System.out.println("insertion success");
	}
	
	
	
	@Override
	public void destroy() throws Exception {
		con.close();
		System.out.println("connection close");
		
		
	}

}
