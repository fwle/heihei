public class AutoConvertDetail {
	public static void main(String[] args) {
		// һ���ж������͵����ݻ������ʱ��
		// ϵͳ�����Զ�����������ת�����������������������ͣ�Ȼ���ٽ��м���
		int n1 = 10;
		// float d1 = n1 + 1.1�� // ���� n1 + 1.1 �����������double
		double d1 = n1 + 1.1; // ��ȷ
		float d2 = n1 + 1.1F; // ��ȷ n1 + 1.1F �����������float

		// ���������ǰѾ���(����)����������͸�ֵ������(����)С����������ʱ��
		// �ͻᱨ����֮�ͻ�����Զ�����ת����
		// int n2 = 1.1; // ���� double ���ȴ��� int

		// ����(byte, short) �� char֮�䲻���໥�Զ�ת��
		// ��������ֵ��byteʱ�������жϸ����Ƿ���byte��Χ�ڣ�����ǾͿ��� -128����127֮��
		byte b1 = 10; // ��ȷ

		/*int n2 = 1; // n2 �� int
		byte b2 = n2; // ���� ����Ǳ�����ֵ����ֱ���ж�����*/

		// char c1 = b1; // ���� byte�����Զ�ת�� char
		// �ġ�byte��short��char �������߿��Լ��㣬����ʱ����תΪint����
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		// short s2 = b2 + s1; // �� b2 + s1 ��int����
		int n2 = b2 + 'a';
		System.out.println(n2);

		// �塢Boolean ������ת��
		boolean pass = true;
		// int num100 = pass; // ����

		// �����Զ�����ԭ�򣺱��ʽ����������Զ�����Ϊ ����������������
		byte b4 = 1;
		short s2 = 100;
		int num200 = 1;
		float f1 = 1.1F;
		float f2 = b4 + s2 + num200 + f1;
	}
}