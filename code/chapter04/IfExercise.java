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
			System.out.println(i1 + "��" + i2 + "�ĺͿ��Ա�3��5����");
		} else {
			System.out.println(i1 + "��" + i2 + "�ĺͲ����Ա�3��5����");
		}

		int year = 2022;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "������");
		} else {
			System.out.println(year + "��ƽ��");
		}

		System.out.println("���������÷֣�");
		int grade = myScanner.nextInt();
		if (grade >= 1 && grade <= 100) {
			if (grade == 100) {
				System.out.println("���ü���");
			} else if (grade > 80 && grade <= 99) {
				System.out.println("��������");
			} else if (grade > 60 && grade <= 80) {
				System.out.println("����һ��");
			} else {
				System.out.println("������");
			}
		} else {
			System.out.println("���÷���Ҫ1~100֮��");
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

		System.out.println("����������ɼ���");
		double score = myScanner.nextDouble();
		if (score >= 1.0 && score <= 10.0) {
			if (score > 8.0) {
				System.out.println("�������Ա�");
				char sex = myScanner.next().charAt(0);
				if (sex == '��') {
					System.out.println("�������������");
				} else if (sex == 'Ů') {
					System.out.println("����Ů�������");
				} else {
					System.out.println("�Ա��������");
				}
			} else {
				System.out.println("�㱻��̭");
			}
		} else {
			System.out.println("�ɼ�Ϊ1~10֮��");
		}
		System.out.println("�������·�");
		int month = myScanner.nextInt();
		if (month >= 1 && month <= 12) {
			if (month >= 4 && month <= 10) {
				System.out.println("�������������");
				int age = myScanner.nextInt();
				if (age >= 18 && age <= 60) {
					System.out.println("Ʊ��Ϊ60");
				} else if (age >= 1 && age < 18) {
					System.out.println("���");
				} else if (age >= 60) {
					System.out.println("1/3");
				} else {
					System.out.println("�����������");
				}
			} else {
				System.out.println("�������������");
				int age = myScanner.nextInt();
				if (age >= 18 && age <= 60) {
					System.out.println("Ʊ��Ϊ40");
				} else {
					System.out.println("20");
				}
			}
		} else {
			System.out.println("�·��������");
		}
	}
}