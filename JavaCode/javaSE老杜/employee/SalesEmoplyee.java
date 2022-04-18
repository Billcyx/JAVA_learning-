public class SalesEmoplyee extends Employee{
	private double monthly_sales;
	private double earned_percent;

	public SalesEmoplyee(String name, int bd_month, double monthly_sales, double earned_percent){
		super(name, bd_month);
		this.monthly_sales = monthly_sales;
		this.earned_percent = earned_percent;
	}

	public double get_monthly_sales() {
		return this.monthly_sales;
	}

	public double get_earned_percent() {
		return this.earned_percent;
	}

	public double getSalary(int month){
		double salary = this.monthly_sales*earned_percent + ((this.get_bd_month()==month)?100:0);
		System.out.println("the SalariedEmoployee born in " + this.get_bd_month() + " should be paid " + salary);
		return salary;
	}
}