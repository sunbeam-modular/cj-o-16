import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {

		int length, breadth;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length - ");
		length = sc.nextInt();

		System.out.println("Enter the breadth - ");
		breadth = sc.nextInt();

		int area = length * breadth;

		System.out.println("Area of Rectnagle - " + area);
	}

}
