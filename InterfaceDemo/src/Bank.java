
public class Bank {
	public static void main(String[] args) {
		IAccount[] savingsAccounts= new IAccount[3];
		savingsAccounts[0]= new SavingsAccount();
		savingsAccounts[1]= new FDAccount();
		savingsAccounts[2]= new RecurringFDAccount();
		
		for(IAccount value:savingsAccounts) {//this value is basically the thrre types of acc here .it can be value or i or a or b any thing
			value.deposit();
			
		}
	}

}
