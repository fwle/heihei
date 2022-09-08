public class TernaryOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		int result = a > b ? a++ : b--;
		 System.out.println(result);

		 int n1 = 102;
		 int n2 = 23;
		 int n3 = 43;
		 int max1 = n1 > n2 ? n1 : n2;
		 int max2 = max1 > n3 ? max1 : n3;
		 // int max1 = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
		 System.out.println(max2);
	}
}