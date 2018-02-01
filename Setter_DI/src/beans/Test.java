package beans;

public class Test {
	private String name;
	private int  age;
	private String email;
	
	
	public Test(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void printData()
	{
		System.out.println("Name="+name);
		System.out.println("age="+age);
		System.out.println("email="+email);
	}

}
