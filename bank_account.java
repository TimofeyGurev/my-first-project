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

class BankAccount{
	private int accauntNumber;
	private double ballance;
	
	//Constructors
	public BankAccount(int accountNumber, double ballance){
		this.accountNumber=accountNumber;
		this.ballance=ballance;
	}
	
	//Methods
	void deposit(double ammount){
		ballance+=ammount;
	}
	
	void withdraw(double ammount){
		ballance-=ammount;
	}
	
	//Getters
	public double getBallance(){
		return ballance;
	}
}

class SavingAccount extends BankAccount{
	public SavingAccount(int accountNumber, double ballance){
		super(accountNumber, ballance);
	}
	@Override
	void withdraw(double ammount){
		if (ammount<=getBallance()){
			super.withdraw(ammount);
		} else {
			System.out.println("Недостаточно средств.");
		}
	}
}

class CreditAccount extends BankAccount{
	double creditLimit=5000;
	public CreditAccount(int accountNumber, double ballance){
		super(accountNumber, ballance);
	}
	@Override
	void withdraw(double ammount){
		if (getBallance()-ammount>=-creditLimit){
			super.withdraw(ammount);
		} else {
			System.out.println("Кредитный лимит исчерпан.");
		}
	}
	
}