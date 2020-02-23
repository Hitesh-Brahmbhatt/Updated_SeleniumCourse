package seleniumautomation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LInputOutputTest {

	public static void main(String[] args) throws IOException {
		
		//Method-1
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		
		int Number = sc.nextInt();
		System.out.println("Multiplication by 5 is " + Number*5);
		
		//OR the shorter version
		
		System.out.println("Multiplication by 5 is " + sc.nextInt()*5);
		
		//Scanner class is used for performing operation which required user inputs during the 
		//runtime of the programme.
		// nextInt is method to catch the number in Scnner class*/
		
		//Method-2
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String Input = " ";
		System.out.println("Please enter your number");
		Input = br.readLine();
		int Num = Integer.parseInt(Input);
		System.out.println(Num*5);
		
		//We use this method to parse means change the data type from one to another,
		//e.g. String to Integer.*/
		
		//Assignment ::-
		//1). Declare 2 String variables  FirstNumber and SecondNumber
		//2) print stsmt to take First number and parse and store in num1
		//3) --------------------Second----------------------------in num2
		//4) Final output ("Addition of two numbers num1+num2"
		
		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		String FirstNumber = " ";
		String SecondNumber = " ";
		System.out.println("Please Enter your num1");
		FirstNumber = br1.readLine();
		int Num1 = Integer.parseInt(FirstNumber);
		System.out.println("Please Enter your num2");
		SecondNumber = br1.readLine();
		int Num2 = Integer.parseInt(SecondNumber);
		System.out.println(Num1+Num2);
		
		//In isr class readLine() is the method to catch the number & parseInt() method to parse String,
		//into integer.
		
		
	}

}
