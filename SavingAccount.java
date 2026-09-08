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