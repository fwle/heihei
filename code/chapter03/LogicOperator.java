public class LogicOperator {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		if (a > 20 && b++ < 90) {
			System.out.println("true");
		}
		System.out.println(b);

		if (a > 20 & b++ < 90) {
			System.out.println("true");
		}
		System.out.println(b);
		System.out.println(a > b);
		System.out.println(!(a > b));
		boolean c = (10 > 1) ^ (8 < 2);
		System.out.println(c);
	}
}