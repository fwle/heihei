public class ArithmeticOperatorExercise01 {
	public static void main(String[] args) {
		int i = 1;
		i = i++; // temp = i; i = i + 1; i = temp;
		System.out.println(i); // 1;

		int i2 = 1;
		i2 = ++i2; // i2 = i2 + 1; temp = i2; i2 = temp;
		System.out.println(i2); // 2

		int i3 = 10;
		int i4 = 20;
		int i5 = i3++;
		System.out.println("i5 = " + i5); // 10
		System.out.println("i4 = " + i4); // 20
		i5 = --i4;
		System.out.println("i5 = " + i5); // 19
		System.out.println("i4 = " + i4); // 19
	}
}