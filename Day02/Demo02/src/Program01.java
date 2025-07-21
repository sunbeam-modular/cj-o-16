import java.util.Scanner;

class Time {
	// fields
	int hr;
	int min;

	// methods
	void acceptTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hrs - ");
		hr = sc.nextInt();
		System.out.println("Enter mins - ");
		min = sc.nextInt();
	}

	void displayTime() {
		System.out.println("Time = " + hr + " : " + min);
	}
}

public class Program01 {
	public static void main(String[] args) {
		int num1 = 10; // variable
		// container to store a value

		Time t1 = null; // variable - Reference
		// stores the address of an object

		t1 = new Time(); // Object of Time

		System.out.println(num1);
		// t1.acceptTime();
		t1.displayTime();
	}

}
