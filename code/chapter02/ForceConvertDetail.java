public class ForceConvertDetail {
	public static void main(String[] args) {
		// һ�����������ݵĴ�С�� �� ����> С������Ҫʹ��ǿ��ת��
		
		// ����ǿ��ת������ֻ�������Ĳ�������Ч��������ʹ��С�����������ȼ�
		// int i1 = (int)10 * 3.5 + 6 * 2.4; // ���� (int)ֻ��10��Ч��
		int i1 = (int)(10 * 2.34 + 6 * 1.3);
		System.out.println(i1);

		// ����char���Ϳ��Ա���int�ĳ���ֵ �����ܱ���int�ı���ֵ����Ҫǿ��ת��
		char c1 = 100; // d
		System.out.println(c1);
		int i2 = 100;
		// char c2 = i2; // ����
		char c2 = (char)i2; // d
		System.out.println(c2);

		// �ġ�byte��short��char �����ڽ�������ʱ������int���ʹ���
		// 
		// ��ϰ��
		
		/*short s = 12;
		s = s - 9; // ����s - 9 ��int����*/

		/*byte b = 10;
		// b = b + 11; // ����
		b = (byte)(b + 11); // ��ȷ*/

		/*char c = 'a';
		int i = 16;
		float d = .314F;
		double result = c + i + d; // ��ȷ
		System.out.println(result);*/

		byte b = 16;
		short s = 14;
		short t = s + b; // ����
		// System.out.println(t);
	}
}