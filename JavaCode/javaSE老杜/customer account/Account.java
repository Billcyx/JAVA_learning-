public class Account{

	private int id;
	private double balance;
	private double air;

	//无参数构造
	public Account() {

	}

	//有参数构造
	public Account(int id, double balance, double air) {
		this.id = id;
		this.balance = balance;
		this.air = air;
	}

	//set and get 
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setId(double air) {
		this.air = air;
	}

	public double getAir() {
		return this.air;
	}

	public void withdraw(double money) {
		this.balance -= money;
		if(balance>0)
			System.out.println("成功取出：" + money);
		else
			System.out.println("余额不足，取钱失败");
	}

	public void deposit(double money) {
		this.balance += money;
		System.out.println("成功存入：" + money);
	}

}
