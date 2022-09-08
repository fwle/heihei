public class For {
	public static void main(String[] args) {
		int count = 3;
		for (int i = 0, j = 0; i <= count; i++, j += 2) {
			System.out.println("i = " + i + " j = " + j);
		}

		int tick = 0;
		int sum = 0;
		int start = 0;
		int end = 100;
		int t = 9;
		for (int i1 = start; i1 <= end; i1++) {
			if (i1 % t == 0) {
				tick++;
				sum += i1;
			}
		}
		System.out.println("tick = " + tick + " sum = " + sum);

		int n = 5;
		for (var i2 = 0; i2 <= n; i2++) {
			System.out.println(i2 + " + " + (n - i2) + " = " + n);
		}
		int i3 = 0;
		String str = "";
		while(i3 <= 100) {
			if (i3 % 3 == 0) {
				str += i3 + " ";
			}
			i3++;
		}
		System.out.println(str);
	}
}