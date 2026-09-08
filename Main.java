public class Main {
	public static void main(String[] args) {
		BankAccount a=new BankAccount(1, 1000);
		SavingAccount b=new SavingAccount(2, 500);
		b.withdraw(600);
		CreditAccount c=new CreditAccount(2, 0);
		c.withdraw(3000);
		c.withdraw(3000);
	}
}