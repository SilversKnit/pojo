package pojo;

public class Pojo_Two {
	
	public static void main(String[] args) {
		
	
		Pojo_One po = new Pojo_One();
		
		po.setName("Gul");
		
		String name = po.getName();
		System.out.println(name);
		
		
		po.setAge(24);
		System.out.println(po.getAge());;
	}
	

}
