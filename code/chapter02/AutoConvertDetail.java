public class AutoConvertDetail {
	public static void main(String[] args) {
		// 一、有多种类型的数据混合运算时，
		// 系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
		int n1 = 10;
		// float d1 = n1 + 1.1； // 错误 n1 + 1.1 结果的类型是double
		double d1 = n1 + 1.1; // 正确
		float d2 = n1 + 1.1F; // 正确 n1 + 1.1F 结果的类型是float

		// 二、当我们把精度(容量)大的数据类型赋值给精度(容量)小的数据类型时，
		// 就会报错，反之就会进行自动类型转换。
		// int n2 = 1.1; // 错误 double 精度大于 int

		// 三、(byte, short) 和 char之间不会相互自动转换
		// 当把数赋值给byte时，会先判断该数是否在byte范围内，如果是就可以 -128——127之间
		byte b1 = 10; // 正确

		/*int n2 = 1; // n2 是 int
		byte b2 = n2; // 错误 如果是变量赋值，则直接判断类型*/

		// char c1 = b1; // 错误 byte不能自动转成 char
		// 四、byte，short，char 他们三者可以计算，计算时首先转为int类型
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		// short s2 = b2 + s1; // 错 b2 + s1 是int类型
		int n2 = b2 + 'a';
		System.out.println(n2);

		// 五、Boolean 不参与转换
		boolean pass = true;
		// int num100 = pass; // 错误

		// 六、自动提升原则：表达式结果的类型自动提升为 操作数中最大的类型
		byte b4 = 1;
		short s2 = 100;
		int num200 = 1;
		float f1 = 1.1F;
		float f2 = b4 + s2 + num200 + f1;
	}
}