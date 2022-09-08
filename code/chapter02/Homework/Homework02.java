public class Homework02 {
	public static void main(String[] args) {
		String book1 = "神雕侠侣";
		String book2 = "天龙八部";
		System.out.println(book1 + book2); // 字符串拼接

		char c1 = '男';
		char c2 = '女';
		System.out.println(c1 + c2); // 得到男和女的字符码值相加结果，char参与运算时会转为int类型

		double price1 = 12.4;
		double price2 = 45.9;
		System.out.println(price1 + price2); // 正常相加的结果

		String name = "张晨林";
		int age = 18;
		double score = 80;
		char gender = '男';
		String hobby = "哈哈哈";
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" 
			+ name + "\t" + age + "\t" + gender + "\t" + score + "\t" + hobby);
	}
}