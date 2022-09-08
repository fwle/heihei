public class ForceConvertDetail {
	public static void main(String[] args) {
		// 一、当进行数据的大小从 大 ——> 小，就需要使用强制转换
		
		// 二、强制转换符号只针对最近的操作数有效，往往会使用小括号提升优先级
		// int i1 = (int)10 * 3.5 + 6 * 2.4; // 错误 (int)只对10有效果
		int i1 = (int)(10 * 2.34 + 6 * 1.3);
		System.out.println(i1);

		// 三、char类型可以保存int的常量值 但不能保存int的变量值，需要强制转换
		char c1 = 100; // d
		System.out.println(c1);
		int i2 = 100;
		// char c2 = i2; // 错误
		char c2 = (char)i2; // d
		System.out.println(c2);

		// 四、byte、short、char 类型在进行运算时，当作int类型处理
		// 
		// 练习题
		
		/*short s = 12;
		s = s - 9; // 错误，s - 9 是int类型*/

		/*byte b = 10;
		// b = b + 11; // 错误
		b = (byte)(b + 11); // 正确*/

		/*char c = 'a';
		int i = 16;
		float d = .314F;
		double result = c + i + d; // 正确
		System.out.println(result);*/

		byte b = 16;
		short s = 14;
		short t = s + b; // 错误
		// System.out.println(t);
	}
}