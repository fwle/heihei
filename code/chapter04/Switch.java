import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ���ַ�(a-d)");
		char c1 = myScanner.next().charAt(0);
		switch(c1) {
			case 'a' :
				System.out.println("����һ");
				break;
			case 'b' :
				System.out.println("���ڶ�");
				break;
			case 'c' :
				System.out.println("������");
				break;
			case 'd' :
				System.out.println("������");
				break;
			default :
				System.out.println("�ַ��������");
		}

		System.out.println("Switch ִ�����");

		System.out.println("������һ����ĸ��תΪ��д(a-e)");
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

		System.out.println("������ɼ�");
		double score = myScanner.nextDouble();
		if (score >= 0 && score <= 100) {
			switch((int)(score / 60)) {
				case 1 :
					System.out.println("�ϸ�");
					break;
				case 0 :
					System.out.println("���ϸ�");
					break;
			}
		} else {
			System.out.println("�ɼ�Ϊ0~100֮��");
		}

		System.out.println("�������·�");
		int month = myScanner.nextInt();
		switch(month) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("����");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("����");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("����");
				break;
			case 12 :
			case 1 :
			case 2 :
				System.out.println("����");
				break;
			default :
				System.out.println("�����·ݴ���");
		}
	}
}