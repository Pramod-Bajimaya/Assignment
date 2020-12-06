package ClassAssignment;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount ramAccount = new BankAccount("Ram");
		ramAccount.depositFund(500.0D);
		ramAccount.withdrawFund(200.0D);
		BankAccount shyamAccount = new BankAccount("Shyam", 2000.0D);
		shyamAccount.withdrawFund(200.0D);
		shyamAccount.depositFund(500.0D);
		ramAccount.depositFund(700.0D);
	}
}