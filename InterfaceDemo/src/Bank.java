
public class Bank {
	public static void main(String[] args) {
		IAccount[] savingsAccounts= new IAccount[3];
		savingsAccounts[0]= new SavingsAccount();
		savingsAccounts[1]= new FDAccount();
		savingsAccounts[2]= new RecurringFDAccount();
		
		for(IAccount IAccount:savingsAccounts) {
			IAccount.deposit();
			
		}
	}

}
