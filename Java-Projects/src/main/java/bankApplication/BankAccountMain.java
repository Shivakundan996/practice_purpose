package bankApplication;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("Shiva", 9876543);
		BankAccountImpl account = new BankAccountImpl();
		account.showMenu();
//		account1.setBalance(account1.getBalance() + 1234);
		System.out.println(account1.getBalance());
	}
}
