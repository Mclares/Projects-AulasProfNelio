package entities;

public class Operador_conta {
	
	private int account_number;
	private String account_holder;
	private double balance;
	
	public Operador_conta() {
	}
	
	public Operador_conta(int account_number, String account_holder, double inideposit) {
		this.account_number = account_number;
		this.account_holder = account_holder;
		addmoney(inideposit);
	}
	
	public Operador_conta(int account_number, String account_holder) {
		this.account_holder = account_holder;
		this.account_holder = account_holder;
	}

	public int getAccount_number() {
		return account_number;
	}
	
	public String getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void addmoney(double amount) {
		balance += amount;
	}
	
	public void subtractmoney(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account: " 
	    + account_number
		+ ", Holder: "
		+ account_holder
		+ ", Balance: $"
		+ String.format("%.2f%n", balance);
	}
}
