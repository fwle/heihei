import java.util.Scanner;
public class doWhile {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int count = 0;
		int end = 100;
		int i = 0;
		do {
			if (i % 5 == 0 && i % 3 != 0) {
				count++;
			}
			i++;
		} while(i <= end);
		System.out.println(count);

		int i1;
		do {
			System.out.println("1 + 1 =");
			i1 = myScanner.nextInt();
			System.out.println("ÄãµÄ»Ø´ðÊÇ£º" + i1);
		} while(i1 != 2);
	}
}