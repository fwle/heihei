public class ArithmeticOperatorExercise02 {
	public static void main(String[] args) {
		// 假如还有 59 天放假，问：合 xx 个星期零 xx 天
		int n = 59;
		int n2 = n / 7;
		int n3 = n % 7;
		System.out.println("还有：" + n2 + "个星期零" + n3 + "天");

		//  定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度。 [234.5]
		double d = 234.5;
		double d2 = 5.0 / 9 * (d - 100);
		System.out.println(d2);
	}
}