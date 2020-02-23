package javabasics;

public class Y {
	Z ObjectB = new Z();
	
	int numberMultiplication() {
		int d = 22;
		int e = d * ObjectB.numberAddition();
		return e;
	}	
	int numberDivision() {
		int f = 15;
		int h = f / ObjectB.numberAddition();
		return h;
		
	}

}
