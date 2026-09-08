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