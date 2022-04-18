public class Customer{

	public static void main(String[] args){
		Account account = new Account(1000,2000,1.23);
		Customer customer = new Customer(account,"Jane Smith");
		customer.getAccount().deposit(100);
		customer.getAccount().withdraw(960);
		customer.getAccount().withdraw(2000);
		customer.detail();
	}

	 private Account account;
	 private String name;

	//无参数构造方法
	public Customer() {

	}

	//有参数构造方法
	public Customer(Account account, String name) {
		this.account = account;
		this.name = name;
	}

	//get and set 
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account act) {
		this.account = act;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//customer info
	public void detail() {
		System.out.println("Customer " + this.name + " has a account : " + "id is " + 
		this.account.getId() + " AnnualInterstRate is " + this.account.getAir() + " and balance is " 
		+ this.account.getBalance());
	}


}