public class Homework02 {
	public static void main(String[] args) {
		String book1 = "�������";
		String book2 = "�����˲�";
		System.out.println(book1 + book2); // �ַ���ƴ��

		char c1 = '��';
		char c2 = 'Ů';
		System.out.println(c1 + c2); // �õ��к�Ů���ַ���ֵ��ӽ����char��������ʱ��תΪint����

		double price1 = 12.4;
		double price2 = 45.9;
		System.out.println(price1 + price2); // ������ӵĽ��

		String name = "�ų���";
		int age = 18;
		double score = 80;
		char gender = '��';
		String hobby = "������";
		System.out.println("����\t����\t�ɼ�\t�Ա�\t����\n" 
			+ name + "\t" + age + "\t" + gender + "\t" + score + "\t" + hobby);
	}
}