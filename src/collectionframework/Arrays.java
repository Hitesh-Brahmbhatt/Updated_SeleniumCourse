package collectionframework;

public class Arrays {

	public static void main(String[] args) {
		
		int[] a;
		a = new int[10];
		a[4] = 8;
		System.out.println("Fifth value of an Array" + " a is " +a[4]);
		
		int[] b = new int[] {12,14,77};
		System.out.println("The lenght of an Array is " + b.length);
		for (int i=0; i<b.length; i++) {
		System.out.println("The value are " +(10-i));
		}
		System.out.println(a[2]);
		System.out.println(b[2]);
	}
}
