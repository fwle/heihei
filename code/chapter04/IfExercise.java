import java.util.Scanner;
public class IfExercise {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		double d1 = 15.3;
		double d2 = 9.4;
		if (d1 > 10.0 && d2 < 20.0) {
			System.out.println(d1 + d2);
		}
		int i1 = 6;
		int i2 = 9;
		if ((i1 + i2) % 3 == 0 && (i1 + i2) % 5 == 0) {
			System.out.println(i1 + "和" + i2 + "的和可以被3和5整除");
		} else {
			System.out.println(i1 + "和" + i2 + "的和不可以被3和5整除");
		}

		int year = 2022;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "是平年");
		}

		System.out.println("请输入信用分：");
		int grade = myScanner.nextInt();
		if (grade >= 1 && grade <= 100) {
			if (grade == 100) {
				System.out.println("信用极好");
			} else if (grade > 80 && grade <= 99) {
				System.out.println("信用优秀");
			} else if (grade > 60 && grade <= 80) {
				System.out.println("信用一般");
			} else {
				System.out.println("不及格");
			}
		} else {
			System.out.println("信用分需要1~100之间");
		}
		boolean b = true;
		if (b = false) {
			System.out.println("a");
		} else if (b) {
			System.out.println("b");
		} else if (!b) {
			System.out.println("c");
		} else {
			System.out.println("d");
		}

		System.out.println("请输入初赛成绩：");
		double score = myScanner.nextDouble();
		if (score >= 1.0 && score <= 10.0) {
			if (score > 8.0) {
				System.out.println("请输入性别");
				char sex = myScanner.next().charAt(0);
				if (sex == '男') {
					System.out.println("进入男子组决赛");
				} else if (sex == '女') {
					System.out.println("进入女子组决赛");
				} else {
					System.out.println("性别输入错误");
				}
			} else {
				System.out.println("你被淘汰");
			}
		} else {
			System.out.println("成绩为1~10之间");
		}
		System.out.println("请输入月份");
		int month = myScanner.nextInt();
		if (month >= 1 && month <= 12) {
			if (month >= 4 && month <= 10) {
				System.out.println("请输入你的年龄");
				int age = myScanner.nextInt();
				if (age >= 18 && age <= 60) {
					System.out.println("票价为60");
				} else if (age >= 1 && age < 18) {
					System.out.println("半价");
				} else if (age >= 60) {
					System.out.println("1/3");
				} else {
					System.out.println("年龄输入错误");
				}
			} else {
				System.out.println("请输入你的年龄");
				int age = myScanner.nextInt();
				if (age >= 18 && age <= 60) {
					System.out.println("票价为40");
				} else {
					System.out.println("20");
				}
			}
		} else {
			System.out.println("月份输入错误");
		}
	}
}