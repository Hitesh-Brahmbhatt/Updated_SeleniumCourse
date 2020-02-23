package encapsulation;

public class ClassA {

	public static void main(String[] args) {
		ClassB Obj = new ClassB();
		Obj.setName("Ankush");
		Obj.setAge(33);
		
		System.out.println("My Name is " + Obj.getName());
		System.out.println("My Age is " + Obj.getAge());
		System.out.println("My Name is " + Obj.getName() + " & My Age is " + Obj.getAge());
	}
}
