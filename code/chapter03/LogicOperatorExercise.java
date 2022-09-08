public class LogicOperatorExercise {
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		// if (x++ == 6 & ++y == 6) {
		// 	x = 11;
		// }
		// System.out.println("x = " + x + ", y = " + y); // x = 6; y = 6;
		// 
		// if (x++ == 6 && ++y == 6) {
		// 	x = 11;
		// }
		// System.out.println("x = " + x + ", y = " + y); // x = 6; y = 5;
		// 
		// if (x++ == 5 | ++y == 5) {
		// 	x = 11;
		// }
		// System.out.println("x = " + x + ", y = " + y); // x = 11; y = 6;
		// 
		if (x++ == 5 || ++y == 5) {
			x = 11;
		}
		System.out.println("x = " + x + ", y = " + y); // x = 11; y = 5;

	}
}