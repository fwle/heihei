public class ArithmeticOperator {
	public static void main(String[] args) {
		System.out.println(10 / 4); // 2 ²»ÊÇ 2.5
		System.out.println(10.0 / 8); // 1.25
		double d1 = 10 / 4;
		System.out.println(d1); // 2.0

		// a % b = a - (a / b * b)
		System.out.println(10 % 3); // 1
		System.out.println(-10 % 3); // -1
		System.out.println(10 % -3); // 1
		System.out.println(-10 % -3); // -1
	}
}