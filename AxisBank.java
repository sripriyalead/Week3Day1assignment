package overrideaassignment;

public class AxisBank extends BankInfo {
	public void deposit() {System.out.println("Deposit from Axis Bank");
	
	}
public static void main(String[] args) {
	AxisBank AB= new AxisBank();
	AB.fixed();
	AB.saving();
	AB.deposit();
}
}
