import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符(a-d)");
		char c1 = myScanner.next().charAt(0);
		switch(c1) {
			case 'a' :
				System.out.println("星期一");
				break;
			case 'b' :
				System.out.println("星期二");
				break;
			case 'c' :
				System.out.println("星期三");
				break;
			case 'd' :
				System.out.println("星期四");
				break;
			default :
				System.out.println("字符输入错误");
		}

		System.out.println("Switch 执行完毕");

		System.out.println("请输入一个字母，转为大写(a-e)");
		char c2 = myScanner.next().charAt(0);
		switch(c2) {
			case 'a' :
				System.out.println('A');
				break;
			case 'b' :
				System.out.println('B');
				break;
			case 'c' :
				System.out.println('C');
				break;
			case 'd' :
				System.out.println('D');
				break;
			case 'e' :
				System.out.println('E');
				break;
			default :
				System.out.println("other");
				break;
		}

		System.out.println("请输入成绩");
		double score = myScanner.nextDouble();
		if (score >= 0 && score <= 100) {
			switch((int)(score / 60)) {
				case 1 :
					System.out.println("合格");
					break;
				case 0 :
					System.out.println("不合格");
					break;
			}
		} else {
			System.out.println("成绩为0~100之间");
		}

		System.out.println("请输入月份");
		int month = myScanner.nextInt();
		switch(month) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("春天");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("夏天");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("秋天");
				break;
			case 12 :
			case 1 :
			case 2 :
				System.out.println("冬天");
				break;
			default :
				System.out.println("输入月份错误");
		}
	}
}