public class HourlyEmoployee extends Employee{
	private double hourlySalary;
	private double hours_per_month;

	public HourlyEmoployee(String name, int bd_month, double hourlySalary, double hours_per_month){
		super(name, bd_month);
		this.hourlySalary = hourlySalary;
		this.hours_per_month = hours_per_month;
	}

	public double getSalary(int month){
		double salary;
		if(this.hours_per_month<=160)
				salary = this.hourlySalary*this.hours_per_month + ((this.get_bd_month()==month)?100:0);
		else 	
				salary = this.hourlySalary*160 + (this.hours_per_month-160)*hourlySalary*1.5
				+ ((this.get_bd_month()==month)?100:0);

		System.out.println("the HourlyEmoployee born in " + this.get_bd_month() + " should be paid " + salary);
		return salary;
	}
}