package beans;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

import com.mysql.jdbc.*;;

public class Test{
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
	

	@PostConstruct
	public void conInit () throws Exception {
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
	
	
	
	@PreDestroy
	public void conCleanup() throws Exception {
		con.close();
		System.out.println("connection close");
		
		
	}

}
