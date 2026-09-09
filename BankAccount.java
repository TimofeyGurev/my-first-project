public class BankAccount{
	private int accountNumber;
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