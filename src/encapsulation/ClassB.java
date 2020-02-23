package encapsulation;

public class ClassB {
	
	private String MyName;
	private int MyAge;
	
	public int getAge() {
		return MyAge;
	}
	
	public String getName() {
		return MyName;
	}
	
	public void setAge(int NewAge) {
		MyAge = NewAge;
	}
	
	public void setName(String NewName) {
		MyName = NewName;
	}
}
