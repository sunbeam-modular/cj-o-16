// 
public class Program02 {

	public static void main(String[] args) {
		int num1 = 10; // primitive type
		Integer i1 = new Integer(num1); // non primitive type
		// boxing - conversion of primitive type to non primitive type

		Integer i2 = new Integer(20); // Non Primitive type
		int num2 = i2.intValue(); // primitive type
		// unboxing - conversion of non primitive type to primitive type

		int num3 = 30; // primitive type
		Integer i3 = num3; // non primitive type
		// AutoBoxing - conversion of primitive to non primitive is done automatically
		// i.e without the help of any methods

		Integer i4 = new Integer(40); // non primitive
		int num4 = i4; // primitive
		// AutoUnboxing - conversion of non primitive type to primitive type done
		// automaticllay
		// i.e without calling any method\

		String i5 = "10";
		int num5 = Integer.parseInt(i5); // wrapper class (unboxing)
	}

}
