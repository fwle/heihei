public class FloatDetail {
	public static void main(String[] args) {
		// float n1 = 1.0;
		float n1 = 1.0F;
		System.out.println(n1);
		double n2 = 1.131313123131313131; // 1.1313131231313132
		System.out.println(n2);
		double n3 = 5.2E2;
		System.out.println(n3);
		double n4 = 2.7;
		double n5 = 8.1 / 3;
		if (n4 == n5) { // ����ȷ
			System.out.println("��ȷ");
		} else {
			System.out.println("����ȷ");
		}

		if (Math.abs(n4 - n5) < 0.0000000001) { // ��ȷ
			System.out.println("��ȷ");
		} else {
			System.out.println("����ȷ");
		}
	}
}