package day11_set_get;

public class Ex04_set_get {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age-1;
	}
	public int getAge() {
		return age;
	}
	
	
}
