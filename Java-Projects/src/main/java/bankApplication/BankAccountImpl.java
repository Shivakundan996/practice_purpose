package bankApplication;

import java.util.Scanner;

public class BankAccountImpl {
	BankAccount account = new BankAccount("Shiva", 9876543);

	void deposit(int amount) {
		if(amount > 0) {
			account.setBalance(account.getBalance() + amount);
			account.setPreviousTransaction(amount);
		}
	}

	void withdraw(int amount) {
		if(amount>0) {
			account.setBalance(account.getBalance() - amount);
			account.setPreviousTransaction(-amount);
		}
	}
	void getPrevTransaction() {
		if(account.getPreviousTransaction() >0) {
			System.out.println("deposited is ; "+account.getPreviousTransaction());
		}
		else {
			System.out.println("withdrawn is : "+Math.abs(account.getPreviousTransaction()));
		}
	}
	
	void showMenu() {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("accoutnholder name : "+account.getCustomerName());
		System.out.println("account id : "+account.getCustomerId());	
		System.out.println("enter a character for services: ");
		
		Character ch = scanner.next().charAt(0);

	
	
		switch(ch) {
		case 'A':
			System.out.println("-------------");
			System.out.println("balance = "+account.getBalance());
			break;
			
		case 'B':
			System.out.println("------------");
			int amount2 = scanner.nextInt();
			deposit(amount2);
			System.out.println("balance = "+account.getBalance());
			break;
			
			
		case 'C':
			System.out.println("------------");
			int amount3 = scanner.nextInt();
			withdraw(amount3);
			System.out.println("balance = "+account.getBalance());
			break;
		 
	 }
}
}
