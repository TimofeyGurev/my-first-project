import java.util.ArrayList;
public class BankAccount{
	private int accountNumber;
	private double ballance;
	private ArrayList<String> transactionHistory=new ArrayList<>();
	
	//Constructors
	public BankAccount(int accountNumber, double ballance){
		this.accountNumber=accountNumber;
		this.ballance=ballance;
	}
	
	//Methods
	void deposit(double ammount){
		ballance+=ammount;
		transactionHistory.add("Пополнение: +"+ammount);
	}
	
	void withdraw(double ammount){
		ballance-=ammount;
		transactionHistory.add("Снятие: -"+ammount);
	}
	
	public void printHistory(){
		for (String record: transactionHistory){
			System.out.println(record);
		}
	}
	
	//Getters
	public double getBallance(){
		return ballance;
	}
}