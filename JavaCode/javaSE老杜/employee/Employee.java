public class Employee{
	private String name;
	private int bd_month;

	public Employee(String name, int bd_month){
		this.name = name;
		this.bd_month = bd_month;
	}

	public int get_bd_month(){
		return this.bd_month;
	}

	public double getSalary(int month){
		return 0;
	}
}