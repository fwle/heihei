import java.util.Scanner; // ��ʾ��java.util �µ�Scanner�ർ��
public class Input {
	public static void main(String[] args) {
		// 1. ���� Scanner�����ڵİ�
		// 2. ���� Scanner ����new ����һ������
		Scanner myScanner = new Scanner(System.in);
		// 3. �����û���������ݣ� ʹ����صķ���
		System.out.println("����������");
		// ������ִ�е�next����ʱ���ͻ�ȴ��û�����
		String name = myScanner.next();
		System.out.println("�������Ա�");
		String sex = myScanner.next();
		System.out.println("����������");
		int age = myScanner.nextInt();
		System.out.println("������нˮ");
		double salary = myScanner.nextDouble();
	}
}