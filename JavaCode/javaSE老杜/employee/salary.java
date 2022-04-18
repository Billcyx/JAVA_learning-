/*
1. 不同的class放到不同的文件中code（将问题分类）
2. 父类中的private属性需要用set，get（封装）这些方法来获取从而在子类的类体中使用
3. super（参数）是用来调用父类的构造方法。
*/

public class salary {
	public static void main(String[] args) {
		int month = 3;
		Employee a = new SalariedEmoployee("a", 3, 250); // 350
		a.getSalary(month);
		Employee b = new HourlyEmoployee("b", 4, 1, 200); // 160*1+1.5*40 = 220
		b.getSalary(month);
		Employee c = new SalesEmoplyee("c", 3, 1000, 0.2); // 300
		c.getSalary(month);
		Employee d = new BasePlusSalesEmployee("d", 5, 1000, 0.1, 100); //200
		d.getSalary(month);
	}
}
