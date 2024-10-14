package SprintBootApi;

public class User {
	private String name;
	private int age;

	// 构造函数
	public User(String name,int age){
	this.name = name;
	this.age = age;
	}

	// Getters 和 Setters
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
}
