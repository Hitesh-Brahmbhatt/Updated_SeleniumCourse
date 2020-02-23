package javabasics;

public class B {
	void firstMethod() {
		System.out.println("I am in Class B");
		//The above class doesn't have "Main" method hence can't run on JVM
		//Hence this method will be run through the class having "Main" method, in this case Class A.
		//No return type because only print statement, hence it's "void"
		//If return type is "int" OR "string" then instead of "void" we can type either "int" OR "string"
	}

}
