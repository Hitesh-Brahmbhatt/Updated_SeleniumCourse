package abstraction;

public class TestBank {

	public static void main(String[] args) {
		Bank b;
		b = new TD();
		System.out.println("The Rate of Interest of TD = " + b.getRateOfInterest());
		b = new BMO();
		System.out.println("The Rate of Interest of BMO = " + b.getRateOfInterest());
	}
}
