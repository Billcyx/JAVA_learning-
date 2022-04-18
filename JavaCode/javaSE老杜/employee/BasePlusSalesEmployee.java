public class BasePlusSalesEmployee extends SalesEmoplyee{
	private double baseSalary;

	public BasePlusSalesEmployee(String name, int bd_month, double monthly_sales, double earned_percent
		, double baseSalary){
		super(name, bd_month, monthly_sales, earned_percent);
		this.baseSalary = baseSalary;
	}

	public double getSalary(int month){
		double salary = this.get_monthly_sales()*this.get_earned_percent() + baseSalary + 
		((this.get_bd_month()==month)?100:0);
		System.out.println("the BasePlusSalesEmployee born in " + this.get_bd_month() + " should be paid " + salary);
		return salary;
	}
}
