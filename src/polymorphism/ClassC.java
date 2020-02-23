package polymorphism;

public class ClassC {

	public static void main(String[] args) {
		ClassD ObjD;
		ObjD = new ClassE();
		ObjD.Printing();
		ObjD = new ClassF();
		ObjD.Printing();
	}

}
