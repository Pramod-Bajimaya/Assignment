package ClassAssignment;

public class BankAccount {
	private String name;
	private double initialBalance;
	private int accountNum;
	private static int accountNumber = 1000;

	public BankAccount(String name) {
		this.name = name;
		this.initialBalance = 0.0D;
		this.accountNum = accountNumber++;
		this.displayInfo();
	}

	public BankAccount(String name, double intialBalance) {
		this.name = name;
		this.initialBalance = intialBalance;
		this.accountNum = accountNumber++;
		this.displayInfo();
	}

	public void depositFund(double amount) {
		this.initialBalance += amount;
		this.displayInfo();
	}

	public void depositFund(double amount, double interest) {
		this.initialBalance += amount;
		this.initialBalance += this.initialBalance * interest / 100.0D;
		this.displayInfo();
	}

	public void withdrawFund(double amount) {
		this.initialBalance -= amount;
		this.displayInfo();
	}

	public void withdrawFund(double amount, double fee) {
		this.initialBalance = this.initialBalance - amount - fee;
		this.displayInfo();
	}

	public void displayInfo() {
		System.out.println("==================");
		System.out.println("Account Name is: " + this.name);
		System.out.println("Account number is: " + this.accountNum);
		System.out.println("Balance is: " + this.initialBalance);
		System.out.println("==================");
	}
}