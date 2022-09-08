public class StringToBasic {
	public static void main(String[] args) {
		// 转字符串
		int i1 = 10;
		long l1 = 20L;
		float f1 = 43.1F;
		double d1 = 12.1;
		byte b1 = 13;
		short s1 = 450;
		String str1 = i1 + "";
		String str2 = l1 + "";
		String str3 = f1 + "";
		String str4 = d1 + "";
		String str5 = b1 + "";
		String str6 = s1 + "";

		// 转基本数据类型
		int i2 = Integer.parseInt("123");
		double d2 = Double.parseDouble("23.21");
		// double d3 = Double.parseDouble("23.21发"); // 异常
		System.out.println(i2);
		System.out.println(d2);

		float f2 = Float.parseFloat("12.31");
		short s2 = Short.parseShort("12");
		long l2 = Long.parseLong("12212");
		// byte b2 = Byte.parseByte("128"); // 异常
		byte b2 = Byte.parseByte("127");
		boolean pass = Boolean.parseBoolean("true");
	}
}