package javabasics;

public class A {

	public static void main(String[] args) {
		B ObjB = new B();
		//Class name is "B" and we are creating object name "ObjB" to call method from Class "B"
		// Method in Class "B" is fistMethod (camelCase name type)
		//This method doesn't have anything to return hence it's "void" type
		//We can't type return type because we are not returning any "int" or "string"
		ObjB.firstMethod();

	}

}
