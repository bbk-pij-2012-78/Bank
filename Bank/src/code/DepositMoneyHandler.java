package code;

public class DepositMoneyHandler {

	private Accounts accounts;
	private Money money;
	private Display display;
	
	public DepositMoneyHandler(Accounts accounts, Money money, Display display) {
		this.accounts = accounts;
		this.money = money;
		this.display = display;		
	}
	
	public boolean deposit(Integer accountNumber, Integer sum) {
		if(!accounts.doesAccountExist(accountNumber)){
			display.displayString("Account number: " + accountNumber + "  does not exist");
			return false;
		}
		accounts.deposit(accountNumber, sum);
		money.giveMoney(sum);
		return true;
	}
	
}
