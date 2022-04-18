public class SalariedEmoployee extends Employee{
	private double monthlySalary;

	public SalariedEmoployee(String name, int bd_month, double monthlySalary){
		super(name, bd_month);
		this.monthlySalary = monthlySalary;
	}

	public double getSalary(int month){
		double salary = this.monthlySalary + ((this.get_bd_month()==month)?100:0);
		System.out.println("the SalariedEmoployee born in " + this.get_bd_month() + " should be paid " + salary);
		return salary;
	}
}