import java.util.Scanner; // 表示把java.util 下的Scanner类导入
public class Input {
	public static void main(String[] args) {
		// 1. 导入 Scanner类所在的包
		// 2. 创建 Scanner 对象，new 创建一个对象
		Scanner myScanner = new Scanner(System.in);
		// 3. 接受用户输入的数据， 使用相关的方法
		System.out.println("请输入名字");
		// 当程序执行到next方法时，就会等待用户输入
		String name = myScanner.next();
		System.out.println("请输入性别");
		String sex = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水");
		double salary = myScanner.nextDouble();
	}
}