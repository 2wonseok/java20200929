package chap11.object.tostring;

public class MyClass extends Object {
	private int age;
	private String name;
	private String password;
	
	public void setFields(int age, String name, String password) {
		this.age = age;
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyClass [age = " + age + ", name = " + name + ", password = " + password + "]";
	}
	
}
