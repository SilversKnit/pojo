package pojo;

public class Pojo_One {
	
	private String name = "Ragul";
	private int age = 10;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
	public static void main(String[] args) {
		
		Pojo_One po = new Pojo_One();
		po.setAge(35);
		System.out.println(po.age);
	}
	

}
