package ClassAssignment;

public class PersonTest {
	public static void main(String[] args) {
		Person obj1 = new Person();
		obj1.setName("Shambho");
		obj1.setAge(27);
		obj1.setNationality("Nepal");
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		System.out.println(obj1.getNationality());
		System.out.println(">->->->->->->->->");
		Person obj2 = new Person();
		obj2.setName("Hari");
		obj2.setAge(28);
		obj2.setNationality("Nepal");
		System.out.println(obj2.getName());
		System.out.println(obj2.getAge());
		System.out.println(obj2.getNationality());
	}
}